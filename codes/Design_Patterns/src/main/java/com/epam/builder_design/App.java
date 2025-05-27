package com.epam.builder_design;

public class App {
    public static void main(String[] args) {

        URL url = new URL();
        url.setProtocol("http://");
        url.setHostname("myweb");
        url.setPort(":8080/");
        url.setPathParam("homepage/");
        url.setQueryParam("random");

//        System.out.print(url.getProtocol());
//        System.out.print(url.getHostname());
//        System.out.print(url.getPort());
//        System.out.print(url.getPathParam());
//        System.out.print(url.getQueryParam());

        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostname("newWebsite:").port("443");

        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.println(urlBuilder.port);

        URLBuilder.Builder builderTwo = new URLBuilder.Builder();
        builderTwo.protocol("https://").hostname("newWebsite:").pathParam("/abc");

        URLBuilder urlBuilderTwo = builder.build();

        System.out.print(urlBuilderTwo.protocol);
        System.out.print(urlBuilderTwo.hostname);
        System.out.print(urlBuilderTwo.port);
        System.out.println(urlBuilderTwo.pathParam);

    }
}


/*

1. Creating the First Builder (builder)

URLBuilder.Builder builder = new URLBuilder.Builder();
A new instance of Builder is created.
At this point, all attributes (protocol, hostname, port, etc.) are null.
2. Setting Values using Method Chaining

builder.protocol("https://").hostname("newWebsite:").port("443");
Each method updates a field inside the builder instance:
protocol("https://") → Sets this.protocol = "https://" and returns this (the builder object).
hostname("newWebsite:") → Sets this.hostname = "newWebsite:" and returns this.
port("443") → Sets this.port = "443" and returns this.
State of builder now:

Field	Value
protocol	"https://"
hostname	"newWebsite:"
port	"443"
pathParam	null
queryParam	null
3. Building urlBuilder Object

URLBuilder urlBuilder = builder.build();
Calls build() method, which creates a new URLBuilder instance.
Inside build():
return new URLBuilder(this);
Passes the builder instance to URLBuilder constructor.
Inside URLBuilder constructor:

this.protocol = build.protocol;
this.hostname = build.hostname;
this.port = build.port;
this.pathParam = build.pathParam;
this.queryParam = build.queryParam;
Copies all values from builder to urlBuilder.
State of urlBuilder:

Field	Value
protocol	"https://"
hostname	"newWebsite:"
port	"443"
pathParam	null
queryParam	null
4. Printing urlBuilder Values

System.out.print(urlBuilder.protocol);
System.out.print(urlBuilder.hostname);
System.out.println(urlBuilder.port);

https://newWebsite:443
 */
