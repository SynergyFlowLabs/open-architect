package com.rabbitmq.client.impl;

import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes13.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.slf4j.c f265860a = org.slf4j.e.k(v.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f265861b = {'c', 'o', ni.f.f333367d, '.', 'r', 'a', 'b', 'b', 'i', 't', ni.f.f333367d, 'q', '.', 'c', 'l', 'i', 'e', 'n', 't', '.', 'v', 'e', 'r', ni.f.f333366c, 'i', 'o', 'n'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f265862c;

    static {
        String strA;
        try {
            strA = c();
        } catch (Exception e10) {
            f265860a.p("Couldn't get version from property file", e10);
            try {
                strA = b();
            } catch (Exception unused) {
                f265860a.p("Couldn't get version with Package#getImplementationVersion", e10);
                strA = a();
            }
        }
        f265862c = strA;
    }

    private static final String a() {
        return "0.0.0";
    }

    private static final String b() {
        if (v.class.getPackage().getImplementationVersion() != null) {
            return v.class.getPackage().getImplementationVersion();
        }
        throw new IllegalStateException("Couldn't get version with Package#getImplementationVersion");
    }

    private static final String c() throws Exception {
        InputStream resourceAsStream = v.class.getClassLoader().getResourceAsStream("rabbitmq-amqp-client.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            String property = properties.getProperty(new String(f265861b));
            if (property != null) {
                return property;
            }
            throw new IllegalStateException("Couldn't find version property in property file");
        } catch (Throwable th2) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            throw th2;
        }
    }
}
