package io.grpc.okhttp.internal;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f290618b = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f290619c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f290620d = e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f290621a;

    class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    private static class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f290622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f290623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f290624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Method f290625h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f290626i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f290627j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final EnumC1982h f290628k;

        public d(io.grpc.okhttp.internal.g<Socket> gVar, io.grpc.okhttp.internal.g<Socket> gVar2, Method method, Method method2, io.grpc.okhttp.internal.g<Socket> gVar3, io.grpc.okhttp.internal.g<Socket> gVar4, Provider provider, EnumC1982h enumC1982h) {
            super(provider);
            this.f290622e = gVar;
            this.f290623f = gVar2;
            this.f290624g = method;
            this.f290625h = method2;
            this.f290626i = gVar3;
            this.f290627j = gVar4;
            this.f290628k = enumC1982h;
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f290622e.e(sSLSocket, Boolean.TRUE);
                this.f290623f.e(sSLSocket, str);
            }
            if (this.f290627j.g(sSLSocket)) {
                this.f290627j.f(sSLSocket, h.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public void d(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
            try {
                socket.connect(inetSocketAddress, i10);
            } catch (SecurityException e10) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e10);
                throw iOException;
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String j(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f290626i.g(sSLSocket) && (bArr = (byte[]) this.f290626i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f290663b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC1982h k() {
            return this.f290628k;
        }

        @Override // io.grpc.okhttp.internal.h
        public void o(Socket socket) throws SocketException {
            Method method = this.f290624g;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public void p(Socket socket) throws SocketException {
            Method method = this.f290625h;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    private static class e extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f290629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f290630f;

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i iVar : list) {
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f290629e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String j(SSLSocket sSLSocket) {
            try {
                return (String) this.f290630f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC1982h k() {
            return EnumC1982h.ALPN_AND_NPN;
        }

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f290629e = method;
            this.f290630f = method2;
        }
    }

    private static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f290631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f290632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f290633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class<?> f290634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Class<?> f290635i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f290631e = method;
            this.f290632f = method2;
            this.f290633g = method3;
            this.f290634h = cls;
            this.f290635i = cls2;
        }

        @Override // io.grpc.okhttp.internal.h
        public void a(SSLSocket sSLSocket) {
            try {
                int i10 = 0 >> 0;
                this.f290633g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                h.f290618b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i10 = 3 ^ 0;
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = list.get(i11);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f290631e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f290634h, this.f290635i}, new g(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String j(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f290632f.invoke(null, sSLSocket));
                if (!gVar.f290637b && gVar.f290638c == null) {
                    h.f290618b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f290637b) {
                    return null;
                }
                return gVar.f290638c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC1982h k() {
            return EnumC1982h.ALPN_AND_NPN;
        }
    }

    private static class g implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f290636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f290637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f290638c;

        public g(List<String> list) {
            this.f290636a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f290662a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f290637b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f290636a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f290636a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f290638c = str;
                            return str;
                        }
                    }
                    String str2 = this.f290636a.get(0);
                    this.f290638c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f290638c = (String) objArr[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: io.grpc.okhttp.internal.h$h, reason: collision with other inner class name */
    public enum EnumC1982h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f290621a = provider;
    }

    public static byte[] b(List<i> list) {
        okio.l lVar = new okio.l();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            if (iVar != i.HTTP_1_0) {
                lVar.writeByte(iVar.toString().length());
                lVar.pa(iVar.toString());
            }
        }
        return lVar.Y5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.grpc.okhttp.internal.h$a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.reflect.Method] */
    private static h e() {
        Method method;
        EnumC1982h enumC1982h;
        Provider providerG = g();
        ?? method2 = 0;
        method2 = 0;
        if (providerG != null) {
            io.grpc.okhttp.internal.g gVar = new io.grpc.okhttp.internal.g(null, "setUseSessionTickets", Boolean.TYPE);
            io.grpc.okhttp.internal.g gVar2 = new io.grpc.okhttp.internal.g(null, "setHostname", String.class);
            io.grpc.okhttp.internal.g gVar3 = new io.grpc.okhttp.internal.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            io.grpc.okhttp.internal.g gVar4 = new io.grpc.okhttp.internal.g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            Method method3 = method;
            ?? r10 = method2;
            if (providerG.getName().equals(com.google.android.gms.security.a.f110908a) || providerG.getName().equals("Conscrypt") || providerG.getName().equals("Ssl_Guard") || m()) {
                enumC1982h = EnumC1982h.ALPN_AND_NPN;
            } else {
                enumC1982h = l() ? EnumC1982h.NPN : EnumC1982h.NONE;
            }
            return new d(gVar, gVar2, method3, r10, gVar3, gVar4, providerG, enumC1982h);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), null);
                    return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), method2);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                return new h(provider);
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static h f() {
        return f290620d;
    }

    private static Provider g() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f290619c) {
                if (str.equals(provider.getClass().getName())) {
                    f290618b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f290618b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean l() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f290618b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    private static boolean m() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f290618b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<i> list) {
    }

    public void d(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public String h() {
        return "OkHttp";
    }

    public Provider i() {
        return this.f290621a;
    }

    public String j(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC1982h k() {
        return EnumC1982h.NONE;
    }

    public void n(String str) {
        System.out.println(str);
    }

    public void o(Socket socket) throws SocketException {
    }

    public void p(Socket socket) throws SocketException {
    }
}
