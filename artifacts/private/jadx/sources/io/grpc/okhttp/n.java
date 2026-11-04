package io.grpc.okhttp;

import io.grpc.internal.v0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f290745b = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final io.grpc.okhttp.internal.h f290746c = io.grpc.okhttp.internal.h.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static n f290747d = d(n.class.getClassLoader());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final io.grpc.okhttp.internal.h f290748a;

    @com.google.common.annotations.e
    static final class a extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f290754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Method f290755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Method f290756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Method f290757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Method f290758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Method f290759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Method f290760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Constructor<?> f290761q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f290749e = new io.grpc.okhttp.internal.g<>(null, "setUseSessionTickets", cls);
            f290750f = new io.grpc.okhttp.internal.g<>(null, "setHostname", String.class);
            f290751g = new io.grpc.okhttp.internal.g<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f290752h = new io.grpc.okhttp.internal.g<>(null, "setAlpnProtocols", byte[].class);
            f290753i = new io.grpc.okhttp.internal.g<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f290754j = new io.grpc.okhttp.internal.g<>(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                        try {
                            Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                            } catch (ClassNotFoundException e10) {
                                e = e10;
                                n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            }
                        } catch (ClassNotFoundException e12) {
                            e = e12;
                            method4 = null;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        method3 = null;
                        method4 = method3;
                        n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f290757m = method;
                        f290758n = method2;
                        f290759o = method3;
                        f290755k = method4;
                        f290756l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f290760p = method6;
                        f290761q = constructor;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        method3 = null;
                        method4 = method3;
                        n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f290757m = method;
                        f290758n = method2;
                        f290759o = method3;
                        f290755k = method4;
                        f290756l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f290760p = method6;
                        f290761q = constructor;
                    }
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f290757m = method;
                    f290758n = method2;
                    f290759o = method3;
                    f290755k = method4;
                    f290756l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f290760p = method6;
                    f290761q = constructor;
                } catch (NoSuchMethodException e17) {
                    e = e17;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    n.f290745b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f290757m = method;
                    f290758n = method2;
                    f290759o = method3;
                    f290755k = method4;
                    f290756l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f290760p = method6;
                    f290761q = constructor;
                }
            } catch (ClassNotFoundException e18) {
                e = e18;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e19) {
                e = e19;
                method = null;
                method2 = null;
            }
            f290757m = method;
            f290758n = method2;
            f290759o = method3;
            f290755k = method4;
            f290756l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e20) {
                    e = e20;
                    n.f290745b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                } catch (NoSuchMethodException e21) {
                    e = e21;
                    n.f290745b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                }
            } catch (ClassNotFoundException e22) {
                e = e22;
                method6 = null;
            } catch (NoSuchMethodException e23) {
                e = e23;
                method6 = null;
            }
            f290760p = method6;
            f290761q = constructor;
        }

        a(io.grpc.okhttp.internal.h hVar) {
            super(hVar);
        }

        @Override // io.grpc.okhttp.n
        protected void c(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
            Constructor<?> constructor;
            boolean z10;
            Method method;
            String[] strArrI = n.i(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (n.g(str)) {
                            Method method2 = f290755k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f290749e.e(sSLSocket, Boolean.TRUE);
                            } else {
                                f290756l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f290760p;
                            if (method3 == null || (constructor = f290761q) == null) {
                                f290750f.e(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException(e12);
                }
            }
            Method method4 = f290759o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    f290757m.invoke(sSLParameters, strArrI);
                    z10 = true;
                } catch (InvocationTargetException e13) {
                    if (!(e13.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e13;
                    }
                    n.f290745b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z10 && (method = f290758n) != null && Arrays.equals(strArrI, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {io.grpc.okhttp.internal.h.b(list)};
            if (this.f290748a.k() == io.grpc.okhttp.internal.h.EnumC1982h.ALPN_AND_NPN) {
                f290752h.f(sSLSocket, objArr);
            }
            if (this.f290748a.k() == io.grpc.okhttp.internal.h.EnumC1982h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f290754j.f(sSLSocket, objArr);
        }

        @Override // io.grpc.okhttp.n
        public String f(SSLSocket sSLSocket) {
            Method method = f290759o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    n.f290745b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f290748a.k() == io.grpc.okhttp.internal.h.EnumC1982h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f290751g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, io.grpc.okhttp.internal.l.f290663b);
                    }
                } catch (Exception e12) {
                    n.f290745b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f290748a.k() != io.grpc.okhttp.internal.h.EnumC1982h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f290753i.f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, io.grpc.okhttp.internal.l.f290663b);
                    }
                } catch (Exception e13) {
                    n.f290745b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                }
            }
            return null;
        }

        @Override // io.grpc.okhttp.n
        public String h(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) throws IOException {
            String strF = f(sSLSocket);
            return strF == null ? super.h(sSLSocket, str, list) : strF;
        }
    }

    @com.google.common.annotations.e
    n(io.grpc.okhttp.internal.h hVar) {
        this.f290748a = (io.grpc.okhttp.internal.h) com.google.common.base.j0.F(hVar, "platform");
    }

    @com.google.common.annotations.e
    static n d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f290745b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f290745b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                return new n(f290746c);
            }
        }
        return new a(f290746c);
    }

    public static n e() {
        return f290747d;
    }

    @com.google.common.annotations.e
    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            v0.d(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List<io.grpc.okhttp.internal.i> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<io.grpc.okhttp.internal.i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
        this.f290748a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f290748a.j(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, @fj.h List<io.grpc.okhttp.internal.i> list) throws IOException {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strF = f(sSLSocket);
            if (strF != null) {
                this.f290748a.a(sSLSocket);
                return strF;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th2) {
            this.f290748a.a(sSLSocket);
            throw th2;
        }
    }
}
