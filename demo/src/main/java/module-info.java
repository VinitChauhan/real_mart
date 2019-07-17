/**
 * 
 */
/**
 * @author vinitchauhan
 *
 */
module demo {
	exports com.example.controller;
	exports com.example.demo;
	exports com.example.utility;

	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
}