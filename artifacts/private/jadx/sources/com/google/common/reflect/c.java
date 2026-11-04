package com.google.common.reflect;

import com.google.common.base.j0;
import com.google.common.base.k0;
import com.google.common.base.o0;
import com.google.common.base.p0;
import com.google.common.collect.b8;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import com.google.common.collect.s4;
import com.google.common.collect.z6;
import com.google.common.io.i0;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@d
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f119816b = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o0 f119817c = o0.j(" ").g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f119818d = ".class";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z6<C1112c> f119819a;

    public static final class a extends C1112c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f119820d;

        a(File file, String resourceName, ClassLoader loader) {
            super(file, resourceName, loader);
            this.f119820d = c.e(resourceName);
        }

        public String g() {
            return this.f119820d;
        }

        public String h() {
            return l.b(this.f119820d);
        }

        public String i() {
            int iLastIndexOf = this.f119820d.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return com.google.common.base.e.m(org.locationtech.jts.geom.l.f338160j, '9').V(this.f119820d.substring(iLastIndexOf + 1));
            }
            String strH = h();
            return strH.isEmpty() ? this.f119820d : this.f119820d.substring(strH.length() + 1);
        }

        public boolean j() {
            return this.f119820d.indexOf(36) == -1;
        }

        public Class<?> k() {
            try {
                return this.f119825c.loadClass(this.f119820d);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.reflect.c.C1112c
        public String toString() {
            return this.f119820d;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f119821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassLoader f119822b;

        b(File home, ClassLoader classloader) {
            this.f119821a = (File) j0.E(home);
            this.f119822b = (ClassLoader) j0.E(classloader);
        }

        private void b(File file, Set<File> scannedUris, z6.a<C1112c> builder) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        c(file, builder);
                    } else {
                        e(file, scannedUris, builder);
                    }
                }
            } catch (SecurityException e10) {
                c.f119816b.warning("Cannot access " + file + ": " + e10);
            }
        }

        private void c(File directory, z6.a<C1112c> builder) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(directory.getCanonicalFile());
            d(directory, "", hashSet, builder);
        }

        private void d(File directory, String packagePrefix, Set<File> currentPath, z6.a<C1112c> builder) throws IOException {
            File[] fileArrListFiles = directory.listFiles();
            if (fileArrListFiles == null) {
                c.f119816b.warning("Cannot read directory " + directory);
                return;
            }
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (file.isDirectory()) {
                    File canonicalFile = file.getCanonicalFile();
                    if (currentPath.add(canonicalFile)) {
                        d(canonicalFile, packagePrefix + name + "/", currentPath, builder);
                        currentPath.remove(canonicalFile);
                    }
                } else {
                    String str = packagePrefix + name;
                    if (!str.equals("META-INF/MANIFEST.MF")) {
                        builder.a(C1112c.e(file, str, this.f119822b));
                    }
                }
            }
        }

        private void e(File file, Set<File> scannedUris, z6.a<C1112c> builder) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    nb<File> it = c.h(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (scannedUris.add(next.getCanonicalFile())) {
                            b(next, scannedUris, builder);
                        }
                    }
                    f(jarFile, builder);
                } finally {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        }

        private void f(JarFile file, z6.a<C1112c> builder) {
            Enumeration<JarEntry> enumerationEntries = file.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.a(C1112c.e(new File(file.getName()), jarEntryNextElement.getName(), this.f119822b));
                }
            }
        }

        public final File a() {
            return this.f119821a;
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f119821a.equals(bVar.f119821a) && this.f119822b.equals(bVar.f119822b)) {
                    return true;
                }
            }
            return false;
        }

        public z6<C1112c> g() throws IOException {
            return h(new HashSet());
        }

        public z6<C1112c> h(Set<File> scannedFiles) throws IOException {
            z6.a<C1112c> aVarS = z6.s();
            scannedFiles.add(this.f119821a);
            b(this.f119821a, scannedFiles, aVarS);
            return aVarS.e();
        }

        public int hashCode() {
            return this.f119821a.hashCode();
        }

        public String toString() {
            return this.f119821a.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.c$c, reason: collision with other inner class name */
    public static class C1112c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f119823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f119824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ClassLoader f119825c;

        C1112c(File file, String resourceName, ClassLoader loader) {
            this.f119823a = (File) j0.E(file);
            this.f119824b = (String) j0.E(resourceName);
            this.f119825c = (ClassLoader) j0.E(loader);
        }

        static C1112c e(File file, String resourceName, ClassLoader loader) {
            return resourceName.endsWith(c.f119818d) ? new a(file, resourceName, loader) : new C1112c(file, resourceName, loader);
        }

        public final com.google.common.io.g a() {
            return i0.a(f());
        }

        public final com.google.common.io.k b(Charset charset) {
            return i0.b(f(), charset);
        }

        final File c() {
            return this.f119823a;
        }

        public final String d() {
            return this.f119824b;
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof C1112c) {
                C1112c c1112c = (C1112c) obj;
                if (this.f119824b.equals(c1112c.f119824b) && this.f119825c == c1112c.f119825c) {
                    return true;
                }
            }
            return false;
        }

        public final URL f() {
            URL resource = this.f119825c.getResource(this.f119824b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f119824b);
        }

        public int hashCode() {
            return this.f119824b.hashCode();
        }

        public String toString() {
            return this.f119824b;
        }
    }

    private c(z6<C1112c> resources) {
        this.f119819a = resources;
    }

    public static c b(ClassLoader classloader) throws IOException {
        z6<b> z6VarM = m(classloader);
        HashSet hashSet = new HashSet();
        nb<b> it = z6VarM.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a());
        }
        z6.a aVarS = z6.s();
        nb<b> it2 = z6VarM.iterator();
        while (it2.hasNext()) {
            aVarS.c(it2.next().h(hashSet));
        }
        return new c(aVarS.e());
    }

    private static l6<URL> d(ClassLoader classloader) {
        if (classloader instanceof URLClassLoader) {
            return l6.B(((URLClassLoader) classloader).getURLs());
        }
        return classloader.equals(ClassLoader.getSystemClassLoader()) ? n() : l6.F();
    }

    @com.google.common.annotations.e
    static String e(String filename) {
        return filename.substring(0, filename.length() - 6).replace('/', '.');
    }

    @com.google.common.annotations.e
    static n6<File, ClassLoader> f(ClassLoader classloader) {
        LinkedHashMap linkedHashMapC0 = b8.c0();
        ClassLoader parent = classloader.getParent();
        if (parent != null) {
            linkedHashMapC0.putAll(f(parent));
        }
        nb<URL> it = d(classloader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals(com.facebook.share.internal.k.f101891c)) {
                File fileO = o(next);
                if (!linkedHashMapC0.containsKey(fileO)) {
                    linkedHashMapC0.put(fileO, classloader);
                }
            }
        }
        return n6.g(linkedHashMapC0);
    }

    @com.google.common.annotations.e
    static URL g(File jarFile, String path) throws MalformedURLException {
        return new URL(jarFile.toURI().toURL(), path);
    }

    @com.google.common.annotations.e
    static z6<File> h(File jarFile, @fj.a Manifest manifest) {
        if (manifest == null) {
            return z6.G();
        }
        z6.a aVarS = z6.s();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f119817c.n(value)) {
                try {
                    URL urlG = g(jarFile, str);
                    if (urlG.getProtocol().equals(com.facebook.share.internal.k.f101891c)) {
                        aVarS.a(o(urlG));
                    }
                } catch (MalformedURLException unused) {
                    f119816b.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return aVarS.e();
    }

    static z6<b> m(ClassLoader classloader) {
        z6.a aVarS = z6.s();
        nb<Map.Entry<File, ClassLoader>> it = f(classloader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            aVarS.a(new b(next.getKey(), next.getValue()));
        }
        return aVarS.e();
    }

    @com.google.common.annotations.e
    static l6<URL> n() {
        l6.a aVarS = l6.s();
        for (String str : o0.j(p0.PATH_SEPARATOR.n()).n(p0.JAVA_CLASS_PATH.n())) {
            try {
                try {
                    aVarS.a(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    aVarS.a(new URL(com.facebook.share.internal.k.f101891c, (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e10) {
                f119816b.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e10);
            }
        }
        return aVarS.e();
    }

    @com.google.common.annotations.e
    static File o(URL url) {
        j0.d(url.getProtocol().equals(com.facebook.share.internal.k.f101891c));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public z6<a> c() {
        return s4.D(this.f119819a).w(a.class).U();
    }

    public z6<C1112c> i() {
        return this.f119819a;
    }

    public z6<a> j() {
        return s4.D(this.f119819a).w(a.class).v(new k0() { // from class: com.google.common.reflect.b
            @Override // com.google.common.base.k0
            public final boolean apply(Object obj) {
                return ((c.a) obj).j();
            }
        }).U();
    }

    public z6<a> k(String packageName) {
        j0.E(packageName);
        z6.a aVarS = z6.s();
        nb<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.h().equals(packageName)) {
                aVarS.a(next);
            }
        }
        return aVarS.e();
    }

    public z6<a> l(String packageName) {
        j0.E(packageName);
        String str = packageName + '.';
        z6.a aVarS = z6.s();
        nb<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.g().startsWith(str)) {
                aVarS.a(next);
            }
        }
        return aVarS.e();
    }
}
