package com.google.common.io;

import com.google.common.collect.x7;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class i0 {

    class a implements z<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f119019a = x7.q();

        a() {
        }

        @Override // com.google.common.io.z
        public boolean a(String line) {
            this.f119019a.add(line);
            return true;
        }

        @Override // com.google.common.io.z
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f119019a;
        }
    }

    private static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final URL f119020a;

        /* synthetic */ b(URL url, a aVar) {
            this(url);
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return this.f119020a.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f119020a + ")";
        }

        private b(URL url) {
            this.f119020a = (URL) com.google.common.base.j0.E(url);
        }
    }

    private i0() {
    }

    public static g a(URL url) {
        return new b(url, null);
    }

    public static k b(URL url, Charset charset) {
        return a(url).a(charset);
    }

    public static void c(URL from, OutputStream to) throws IOException {
        a(from).g(to);
    }

    @z7.a
    public static URL d(Class<?> contextClass, String resourceName) {
        URL resource = contextClass.getResource(resourceName);
        com.google.common.base.j0.y(resource != null, "resource %s relative to %s not found.", resourceName, contextClass.getName());
        return resource;
    }

    @z7.a
    public static URL e(String resourceName) {
        URL resource = ((ClassLoader) com.google.common.base.b0.a(Thread.currentThread().getContextClassLoader(), i0.class.getClassLoader())).getResource(resourceName);
        com.google.common.base.j0.u(resource != null, "resource %s not found.", resourceName);
        return resource;
    }

    @z7.a
    @f0
    public static <T> T f(URL url, Charset charset, z<T> zVar) throws IOException {
        return (T) b(url, charset).q(zVar);
    }

    public static List<String> g(URL url, Charset charset) throws IOException {
        return (List) f(url, charset, new a());
    }

    public static byte[] h(URL url) throws IOException {
        return a(url).o();
    }

    public static String i(URL url, Charset charset) throws IOException {
        return b(url, charset).n();
    }
}
