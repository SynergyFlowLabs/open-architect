package io.sentry.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.g;
import io.sentry.m1;
import io.sentry.w7;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile a f305608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f305609e = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f305610a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2224a f305611b = new C2224a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private io.sentry.util.a f305612c = new io.sentry.util.a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C2224a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private volatile String f305613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private volatile String f305614b;

        @Nullable
        public String d() {
            return this.f305613a;
        }

        @Nullable
        public String e() {
            return this.f305614b;
        }
    }

    private a() {
    }

    @NotNull
    public static a a() {
        if (f305608d == null) {
            m1 m1VarA = f305609e.a();
            try {
                if (f305608d == null) {
                    f305608d = new a();
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f305608d;
    }

    public void b() {
        if (this.f305610a) {
            return;
        }
        try {
            m1 m1VarA = this.f305612c.a();
            try {
                if (this.f305610a) {
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                    this.f305610a = true;
                    return;
                }
                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                while (resources.hasMoreElements()) {
                    try {
                        Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                        if (mainAttributes != null) {
                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                            String value2 = mainAttributes.getValue("Implementation-Version");
                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                            if (value != null && value2 != null) {
                                this.f305611b.f305613a = value;
                                this.f305611b.f305614b = value2;
                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                if (value5 != null) {
                                    w7.e().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                    w7.e().a("OpenTelemetry");
                                }
                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                if (value6 != null) {
                                    w7.e().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                    w7.e().a("OpenTelemetry-Agent");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                    w7.e().a("OpenTelemetry-Agentless");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                    w7.e().a("OpenTelemetry-Agentless-Spring");
                                }
                            }
                            if (value3 != null && value2 != null && value4 != null && value3.startsWith(g.f305444a)) {
                                w7.e().b(value4, value2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
                this.f305610a = true;
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f305610a = true;
            throw th4;
        }
    }

    @Nullable
    public C2224a c() {
        b();
        if (this.f305611b.f305614b == null) {
            return null;
        }
        return this.f305611b;
    }
}
