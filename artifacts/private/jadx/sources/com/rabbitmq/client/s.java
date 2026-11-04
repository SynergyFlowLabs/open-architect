package com.rabbitmq.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes13.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f266026a = "rabbitmq.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f266027b = "username";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f266028c = "password";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f266029d = "virtual.host";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f266030e = "host";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f266031f = "port";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f266032g = "connection.channel.max";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f266033h = "connection.frame.max";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f266034i = "connection.heartbeat";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f266035j = "connection.timeout";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f266036k = "handshake.timeout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f266037l = "shutdown.timeout";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f266038m = "client.properties.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f266039n = "connection.recovery.enabled";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f266040o = "topology.recovery.enabled";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f266041p = "connection.recovery.interval";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f266042q = "channel.rpc.timeout";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f266043r = "channel.should.check.rpc.response.type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f266044s = "use.nio";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f266045t = "nio.read.byte.buffer.size";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f266046u = "nio.write.byte.buffer.size";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f266047v = "nio.nb.io.threads";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f266048w = "nio.write.enqueuing.timeout.in.ms";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f266049x = "nio.write.queue.capacity";

    public static void a(r rVar, String str) throws Throwable {
        b(rVar, str, f266026a);
    }

    public static void b(r rVar, String str, String str2) throws Throwable {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Property file argument cannot be null or empty");
        }
        Properties properties = new Properties();
        BufferedReader bufferedReader = null;
        InputStream resourceAsStream = null;
        if (str.startsWith("classpath:")) {
            try {
                resourceAsStream = s.class.getResourceAsStream(str.substring(10));
                properties.load(resourceAsStream);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                throw th2;
            }
        } else {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                try {
                    properties.load(bufferedReader2);
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        d(rVar, properties, str2);
    }

    public static void c(r rVar, Map<String, String> map) {
        d(rVar, map, f266026a);
    }

    public static void d(r rVar, Map<String, String> map, String str) {
        if (str == null) {
            str = "";
        }
        String str2 = map.get(str + "uri");
        if (str2 != null) {
            try {
                rVar.W0(str2);
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException("Error while setting AMQP URI: " + str2, e10);
            } catch (KeyManagementException e11) {
                throw new IllegalArgumentException("Error while setting AMQP URI: " + str2, e11);
            } catch (NoSuchAlgorithmException e12) {
                throw new IllegalArgumentException("Error while setting AMQP URI: " + str2, e12);
            }
        }
        String str3 = map.get(str + "username");
        if (str3 != null) {
            rVar.Y0(str3);
        }
        String str4 = map.get(str + "password");
        if (str4 != null) {
            rVar.D0(str4);
        }
        String str5 = map.get(str + f266029d);
        if (str5 != null) {
            rVar.Z0(str5);
        }
        String str6 = map.get(str + "host");
        if (str6 != null) {
            rVar.y0(str6);
        }
        String str7 = map.get(str + f266031f);
        if (str7 != null) {
            rVar.E0(Integer.valueOf(str7).intValue());
        }
        String str8 = map.get(str + f266032g);
        if (str8 != null) {
            rVar.G0(Integer.valueOf(str8).intValue());
        }
        String str9 = map.get(str + f266033h);
        if (str9 != null) {
            rVar.H0(Integer.valueOf(str9).intValue());
        }
        String str10 = map.get(str + f266034i);
        if (str10 != null) {
            rVar.I0(Integer.valueOf(str10).intValue());
        }
        String str11 = map.get(str + f266035j);
        if (str11 != null) {
            rVar.r0(Integer.valueOf(str11).intValue());
        }
        String str12 = map.get(str + f266036k);
        if (str12 != null) {
            rVar.w0(Integer.valueOf(str12).intValue());
        }
        String str13 = map.get(str + f266037l);
        if (str13 != null) {
            rVar.M0(Integer.valueOf(str13).intValue());
        }
        HashMap map2 = new HashMap();
        Map<String, Object> mapO0 = com.rabbitmq.client.impl.i.o0();
        map2.putAll(mapO0);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().startsWith(str + f266038m)) {
                String strSubstring = entry.getKey().substring((str + f266038m).length());
                if (mapO0.containsKey(strSubstring) && (entry.getValue() == null || entry.getValue().trim().isEmpty())) {
                    map2.remove(strSubstring);
                } else {
                    map2.put(strSubstring, entry.getValue());
                }
            }
        }
        rVar.p0(map2);
        String str14 = map.get(str + f266039n);
        if (str14 != null) {
            rVar.m0(Boolean.valueOf(str14).booleanValue());
        }
        String str15 = map.get(str + f266040o);
        if (str15 != null) {
            rVar.R0(Boolean.getBoolean(str15));
        }
        String str16 = map.get(str + f266041p);
        if (str16 != null) {
            rVar.B0(Long.valueOf(str16).longValue());
        }
        String str17 = map.get(str + f266042q);
        if (str17 != null) {
            rVar.n0(Integer.valueOf(str17).intValue());
        }
        String str18 = map.get(str + f266043r);
        if (str18 != null) {
            rVar.o0(Boolean.valueOf(str18).booleanValue());
        }
        String str19 = map.get(str + f266044s);
        if (str19 == null || !Boolean.valueOf(str19).booleanValue()) {
            return;
        }
        rVar.d1();
        com.rabbitmq.client.impl.nio.r rVar2 = new com.rabbitmq.client.impl.nio.r();
        String str20 = map.get(str + f266045t);
        if (str20 != null) {
            rVar2.t(Integer.valueOf(str20).intValue());
        }
        String str21 = map.get(str + f266046u);
        if (str21 != null) {
            rVar2.x(Integer.valueOf(str21).intValue());
        }
        String str22 = map.get(str + f266047v);
        if (str22 != null) {
            rVar2.r(Integer.valueOf(str22).intValue());
        }
        String str23 = map.get(str + f266048w);
        if (str23 != null) {
            rVar2.y(Integer.valueOf(str23).intValue());
        }
        String str24 = map.get(str + f266049x);
        if (str24 != null) {
            rVar2.z(Integer.valueOf(str24).intValue());
        }
        rVar.C0(rVar2);
    }

    public static void e(r rVar, Properties properties) {
        d(rVar, properties, f266026a);
    }

    public static void f(r rVar, Properties properties, String str) {
        d(rVar, properties, str);
    }
}
