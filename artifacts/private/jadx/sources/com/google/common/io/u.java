package com.google.common.io;

import com.google.common.collect.l6;
import com.google.common.collect.x7;
import com.google.common.collect.z6;
import com.google.common.graph.s1;
import com.google.common.graph.t1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s1<File> f119057a = new b();

    class a implements z<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f119058a = x7.q();

        a() {
        }

        @Override // com.google.common.io.z
        public boolean a(String line) {
            this.f119058a.add(line);
            return true;
        }

        @Override // com.google.common.io.z
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f119058a;
        }
    }

    class b implements s1<File> {
        b() {
        }

        @Override // com.google.common.graph.s1
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public Iterable<File> a(File file) {
            File[] fileArrListFiles;
            return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? l6.F() : Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
        }
    }

    private static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f119059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z6<t> f119060b;

        /* synthetic */ c(File file, t[] tVarArr, a aVar) {
            this(file, tVarArr);
        }

        @Override // com.google.common.io.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileOutputStream c() throws IOException {
            return new FileOutputStream(this.f119059a, this.f119060b.contains(t.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.f119059a + ", " + this.f119060b + ")";
        }

        private c(File file, t... modes) {
            this.f119059a = (File) com.google.common.base.j0.E(file);
            this.f119060b = z6.C(modes);
        }
    }

    private static final class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f119061a;

        /* synthetic */ d(File file, a aVar) {
            this(file);
        }

        @Override // com.google.common.io.g
        public byte[] o() throws IOException {
            o oVarB = o.b();
            try {
                FileInputStream fileInputStream = (FileInputStream) oVarB.c(m());
                byte[] bArrV = h.v(fileInputStream, fileInputStream.getChannel().size());
                oVarB.close();
                return bArrV;
            } catch (Throwable th2) {
                try {
                    throw oVarB.d(th2);
                } catch (Throwable th3) {
                    oVarB.close();
                    throw th3;
                }
            }
        }

        @Override // com.google.common.io.g
        public long p() throws IOException {
            if (this.f119061a.isFile()) {
                return this.f119061a.length();
            }
            throw new FileNotFoundException(this.f119061a.toString());
        }

        @Override // com.google.common.io.g
        public com.google.common.base.e0<Long> q() {
            return this.f119061a.isFile() ? com.google.common.base.e0.f(Long.valueOf(this.f119061a.length())) : com.google.common.base.e0.a();
        }

        @Override // com.google.common.io.g
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public FileInputStream m() throws IOException {
            return new FileInputStream(this.f119061a);
        }

        public String toString() {
            return "Files.asByteSource(" + this.f119061a + ")";
        }

        private d(File file) {
            this.f119061a = (File) com.google.common.base.j0.E(file);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class e implements com.google.common.base.k0<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f119062a = new a("IS_DIRECTORY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f119063b = new b("IS_FILE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ e[] f119064c = k();

        final enum a extends e {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        }

        final enum b extends e {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        }

        static {
            int i10 = 5 >> 1;
        }

        private e(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ e[] k() {
            return new e[]{f119062a, f119063b};
        }

        public static e valueOf(String name) {
            return (e) Enum.valueOf(e.class, name);
        }

        public static e[] values() {
            return (e[]) f119064c.clone();
        }

        /* synthetic */ e(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    private u() {
    }

    @z7.a
    @f0
    @Deprecated
    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    public static <T> T A(File file, Charset charset, z<T> zVar) throws IOException {
        return (T) e(file, charset).q(zVar);
    }

    public static List<String> B(File file, Charset charset) throws IOException {
        return (List) e(file, charset).q(new a());
    }

    public static String C(String pathname) {
        com.google.common.base.j0.E(pathname);
        if (pathname.length() == 0) {
            return ".";
        }
        Iterable<String> iterableN = com.google.common.base.o0.h('/').g().n(pathname);
        ArrayList arrayList = new ArrayList();
        for (String str : iterableN) {
            str.getClass();
            if (!str.equals(".")) {
                if (!str.equals("..")) {
                    arrayList.add(str);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.add("..");
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String strK = com.google.common.base.a0.o('/').k(arrayList);
        if (pathname.charAt(0) == '/') {
            strK = "/" + strK;
        }
        while (strK.startsWith("/../")) {
            strK = strK.substring(3);
        }
        if (strK.equals("/..")) {
            return "/";
        }
        return "".equals(strK) ? "." : strK;
    }

    public static byte[] D(File file) throws IOException {
        return c(file).o();
    }

    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String E(File file, Charset charset) throws IOException {
        return e(file, charset).n();
    }

    public static void F(File file) throws IOException {
        com.google.common.base.j0.E(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to update modification time of " + file);
    }

    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void G(CharSequence from, File to, Charset charset) throws IOException {
        d(to, charset, new t[0]).c(from);
    }

    public static void H(byte[] from, File to) throws IOException {
        b(to, new t[0]).d(from);
    }

    @z7.m(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void a(CharSequence from, File to, Charset charset) throws IOException {
        d(to, charset, t.APPEND).c(from);
    }

    public static f b(File file, t... modes) {
        return new c(file, modes, null);
    }

    public static g c(File file) {
        return new d(file, null);
    }

    public static j d(File file, Charset charset, t... modes) {
        return b(file, modes).a(charset);
    }

    public static k e(File file, Charset charset) {
        return c(file).a(charset);
    }

    public static void f(File from, File to) throws IOException {
        com.google.common.base.j0.y(!from.equals(to), "Source %s and destination %s must be different", from, to);
        c(from).f(b(to, new t[0]));
    }

    public static void g(File from, OutputStream to) throws IOException {
        c(from).g(to);
    }

    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void h(File from, Charset charset, Appendable to) throws IOException {
        e(from, charset).f(to);
    }

    public static void i(File file) throws IOException {
        com.google.common.base.j0.E(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    @com.google.common.annotations.a
    @Deprecated
    public static File j() {
        return j0.f119021a.a();
    }

    public static boolean k(File file1, File file2) throws IOException {
        com.google.common.base.j0.E(file1);
        com.google.common.base.j0.E(file2);
        if (file1 == file2 || file1.equals(file2)) {
            return true;
        }
        long length = file1.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return c(file1).e(c(file2));
        }
        return false;
    }

    public static t1<File> l() {
        return t1.h(f119057a);
    }

    public static String m(String fullName) {
        com.google.common.base.j0.E(fullName);
        String name = new File(fullName).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static String n(String file) {
        com.google.common.base.j0.E(file);
        String name = new File(file).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static com.google.common.hash.p o(File file, com.google.common.hash.q hashFunction) throws IOException {
        return c(file).j(hashFunction);
    }

    public static com.google.common.base.k0<File> p() {
        return e.f119062a;
    }

    public static com.google.common.base.k0<File> q() {
        return e.f119063b;
    }

    public static MappedByteBuffer r(File file) throws IOException {
        com.google.common.base.j0.E(file);
        return s(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer s(File file, FileChannel.MapMode mode) throws IOException {
        return u(file, mode, -1L);
    }

    public static MappedByteBuffer t(File file, FileChannel.MapMode mode, long size) throws IOException {
        com.google.common.base.j0.p(size >= 0, "size (%s) may not be negative", size);
        return u(file, mode, size);
    }

    private static MappedByteBuffer u(File file, FileChannel.MapMode mode, long size) throws IOException {
        com.google.common.base.j0.E(file);
        com.google.common.base.j0.E(mode);
        o oVarB = o.b();
        try {
            FileChannel fileChannel = (FileChannel) oVarB.c(((RandomAccessFile) oVarB.c(new RandomAccessFile(file, mode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"))).getChannel());
            if (size == -1) {
                size = fileChannel.size();
            }
            MappedByteBuffer map = fileChannel.map(mode, 0L, size);
            oVarB.close();
            return map;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public static void v(File from, File to) throws IOException {
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        com.google.common.base.j0.y(!from.equals(to), "Source %s and destination %s must be different", from, to);
        if (from.renameTo(to)) {
            return;
        }
        f(from, to);
        if (from.delete()) {
            return;
        }
        if (to.delete()) {
            throw new IOException("Unable to delete " + from);
        }
        throw new IOException("Unable to delete " + to);
    }

    public static BufferedReader w(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.j0.E(file);
        com.google.common.base.j0.E(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter x(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.j0.E(file);
        com.google.common.base.j0.E(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @z7.a
    @f0
    @Deprecated
    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    public static <T> T y(File file, com.google.common.io.e<T> eVar) throws IOException {
        return (T) c(file).n(eVar);
    }

    @Deprecated
    @z7.m(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    @fj.a
    public static String z(File file, Charset charset) throws IOException {
        return e(file, charset).o();
    }
}
