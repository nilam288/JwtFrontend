/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yash.jwt;

/**
 *
 * @author nilam
 */
public class AuthenticationException extends RuntimeException{
     public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
