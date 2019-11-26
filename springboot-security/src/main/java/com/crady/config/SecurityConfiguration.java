package com.crady.config;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * @author :Crady
 * date :2019/11/21 15:14
 * desc : 自定义安全配置类
 **/
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //加密盐值
    private static final String SECRET = "crady";

    /**
     * 赋予用户角色，加载用户信息
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //简单加密器
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //可带盐值的加密器
        PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder(SECRET);

        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("admin")
                //passwordEncoder.encode("admin")的密文
                .password("179ac75f2967d2c82cc78216427ac066912a475bc16be910c24588ab26c402feacc39b83689aeb8")
                .roles("USER","ADMIN")

                .and()
                .withUser("crady")
                //passwordEncoder.encode("crady")的密文
                .password("2197c4013e878fde732282d8e6c8a4e38a369ff967b61267af9347baa13dfaece6eff6127fc81199")
                .roles("USER")

                .and()
                .withUser("test")
                //passwordEncoder.encode("test")的密文
                .password("49eb906ddf7f9990f90066cb7554d7ee34d83bcda995dc1ec41031322e0901b9c1bfed09aee7177d")
                .roles("TEST");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    /**
     * 不同角色对应不同的权限
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //限定"/demo/hello"请求赋予"ADMIN"或者"USER"角色
                .antMatchers("/demo/hello").hasAnyRole("ADMIN","USER")
                //限定"/demo/hello"请求赋予"ADMIN"角色
                .antMatchers("/demo/nihao").hasAnyRole("ADMIN")
                .anyRequest().permitAll()
                //对于没有配置权限的其他请求允许匿名访问
                .and().anonymous()
                //使用http默认登录页面
                .and().formLogin()
                //启动http基础验证
                .and().httpBasic();
    }

    public static void main(String []args){
        PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder(SECRET);
        String password = passwordEncoder.encode("crady");
        System.out.println(password);
    }
}
