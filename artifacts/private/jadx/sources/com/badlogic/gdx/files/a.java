package com.badlogic.gdx.files;

import com.badlogic.gdx.b;
import com.badlogic.gdx.utils.e1;
import com.badlogic.gdx.utils.t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected File f94150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b.a f94151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b f94152c;

    /* JADX INFO: renamed from: com.badlogic.gdx.files.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0837a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94153a;

        static {
            int[] iArr = new int[b.a.values().length];
            f94153a = iArr;
            try {
                iArr[b.a.Internal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94153a[b.a.Classpath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected a(b bVar) {
        this.f94152c = bVar;
    }

    private static void b(a aVar, a aVar2) {
        aVar2.v();
        for (a aVar3 : aVar.r()) {
            a aVarA = aVar2.a(aVar3.x());
            if (aVar3.o()) {
                b(aVar3, aVarA);
            } else {
                c(aVar3, aVarA);
            }
        }
    }

    private static void c(a aVar, a aVar2) {
        try {
            aVar2.P(aVar.D(), false);
        } catch (Exception e10) {
            throw new t("Error copying source file: " + aVar.f94150a + " (" + aVar.f94151b + ")\nTo destination: " + aVar2.f94150a + " (" + aVar2.f94151b + ")", e10);
        }
    }

    private static boolean g(File file) {
        i(file, false);
        return file.delete();
    }

    private static void i(File file, boolean z10) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        int length = fileArrListFiles.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!fileArrListFiles[i10].isDirectory()) {
                fileArrListFiles[i10].delete();
            } else if (z10) {
                i(fileArrListFiles[i10], true);
            } else {
                g(fileArrListFiles[i10]);
            }
        }
    }

    private int k() {
        int iQ = (int) q();
        if (iQ != 0) {
            return iQ;
        }
        return 512;
    }

    public String A() {
        return this.f94150a.getPath().replace('\\', '/');
    }

    public String B() {
        String strReplace = this.f94150a.getPath().replace('\\', '/');
        int iLastIndexOf = strReplace.lastIndexOf(46);
        return iLastIndexOf == -1 ? strReplace : strReplace.substring(0, iLastIndexOf);
    }

    public BufferedInputStream C(int i10) {
        return new BufferedInputStream(D(), i10);
    }

    public InputStream D() {
        b.a aVar = this.f94151b;
        if (aVar != b.a.Classpath && ((aVar != b.a.Internal || n().exists()) && (this.f94151b != b.a.Local || n().exists()))) {
            try {
                return new FileInputStream(n());
            } catch (Exception e10) {
                if (n().isDirectory()) {
                    throw new t("Cannot open a stream to a directory: " + this.f94150a + " (" + this.f94151b + ")", e10);
                }
                throw new t("Error reading file: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
        }
        InputStream resourceAsStream = a.class.getResourceAsStream("/" + this.f94150a.getPath().replace('\\', '/'));
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new t("File not found: " + this.f94150a + " (" + this.f94151b + ")");
    }

    public int E(byte[] bArr, int i10, int i11) {
        InputStream inputStreamD = D();
        int i12 = 0;
        while (true) {
            try {
                try {
                    int i13 = inputStreamD.read(bArr, i10 + i12, i11 - i12);
                    if (i13 <= 0) {
                        e1.a(inputStreamD);
                        return i12 - i10;
                    }
                    i12 += i13;
                } catch (IOException e10) {
                    throw new t("Error reading file: " + this, e10);
                }
            } catch (Throwable th2) {
                e1.a(inputStreamD);
                throw th2;
            }
        }
    }

    public byte[] F() {
        InputStream inputStreamD = D();
        try {
            try {
                byte[] bArrF = e1.f(inputStreamD, k());
                e1.a(inputStreamD);
                return bArrF;
            } catch (IOException e10) {
                throw new t("Error reading file: " + this, e10);
            }
        } catch (Throwable th2) {
            e1.a(inputStreamD);
            throw th2;
        }
    }

    public String G() {
        return H(null);
    }

    public String H(String str) {
        StringBuilder sb2 = new StringBuilder(k());
        InputStreamReader inputStreamReader = null;
        try {
            try {
                inputStreamReader = str == null ? new InputStreamReader(D()) : new InputStreamReader(D(), str);
                char[] cArr = new char[256];
                while (true) {
                    int i10 = inputStreamReader.read(cArr);
                    if (i10 == -1) {
                        e1.a(inputStreamReader);
                        return sb2.toString();
                    }
                    sb2.append(cArr, 0, i10);
                }
            } catch (IOException e10) {
                throw new t("Error reading layout file: " + this, e10);
            }
        } catch (Throwable th2) {
            e1.a(inputStreamReader);
            throw th2;
        }
    }

    public BufferedReader I(int i10) {
        return new BufferedReader(new InputStreamReader(D()), i10);
    }

    public BufferedReader J(int i10, String str) {
        try {
            return new BufferedReader(new InputStreamReader(D(), str), i10);
        } catch (UnsupportedEncodingException e10) {
            throw new t("Error reading file: " + this, e10);
        }
    }

    public Reader K() {
        return new InputStreamReader(D());
    }

    public Reader L(String str) {
        InputStream inputStreamD = D();
        try {
            return new InputStreamReader(inputStreamD, str);
        } catch (UnsupportedEncodingException e10) {
            e1.a(inputStreamD);
            throw new t("Error reading file: " + this, e10);
        }
    }

    public b.a M() {
        return this.f94151b;
    }

    public OutputStream N(boolean z10) {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot write to a classpath file: " + this.f94150a);
        }
        if (aVar == b.a.Internal) {
            throw new t("Cannot write to an internal file: " + this.f94150a);
        }
        z().v();
        try {
            return new FileOutputStream(n(), z10);
        } catch (Exception e10) {
            if (n().isDirectory()) {
                throw new t("Cannot open a stream to a directory: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
            throw new t("Error writing file: " + this.f94150a + " (" + this.f94151b + ")", e10);
        }
    }

    public OutputStream O(boolean z10, int i10) {
        return new BufferedOutputStream(N(z10), i10);
    }

    public void P(InputStream inputStream, boolean z10) {
        OutputStream outputStreamN = null;
        try {
            try {
                outputStreamN = N(z10);
                e1.b(inputStream, outputStreamN);
                e1.a(inputStream);
                e1.a(outputStreamN);
            } catch (Exception e10) {
                throw new t("Error stream writing to file: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
        } catch (Throwable th2) {
            e1.a(inputStream);
            e1.a(outputStreamN);
            throw th2;
        }
    }

    public void Q(byte[] bArr, int i10, int i11, boolean z10) {
        OutputStream outputStreamN = N(z10);
        try {
            try {
                outputStreamN.write(bArr, i10, i11);
                e1.a(outputStreamN);
            } catch (IOException e10) {
                throw new t("Error writing file: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
        } catch (Throwable th2) {
            e1.a(outputStreamN);
            throw th2;
        }
    }

    public void R(byte[] bArr, boolean z10) {
        OutputStream outputStreamN = N(z10);
        try {
            try {
                outputStreamN.write(bArr);
                e1.a(outputStreamN);
            } catch (IOException e10) {
                throw new t("Error writing file: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
        } catch (Throwable th2) {
            e1.a(outputStreamN);
            throw th2;
        }
    }

    public void S(String str, boolean z10) {
        T(str, z10, null);
    }

    public void T(String str, boolean z10, String str2) {
        Writer writerV = null;
        try {
            try {
                writerV = V(z10, str2);
                writerV.write(str);
                e1.a(writerV);
            } catch (Exception e10) {
                throw new t("Error writing file: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
        } catch (Throwable th2) {
            e1.a(writerV);
            throw th2;
        }
    }

    public Writer U(boolean z10) {
        return V(z10, null);
    }

    public Writer V(boolean z10, String str) {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot write to a classpath file: " + this.f94150a);
        }
        if (aVar == b.a.Internal) {
            throw new t("Cannot write to an internal file: " + this.f94150a);
        }
        z().v();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n(), z10);
            return str == null ? new OutputStreamWriter(fileOutputStream) : new OutputStreamWriter(fileOutputStream, str);
        } catch (IOException e10) {
            if (n().isDirectory()) {
                throw new t("Cannot open a stream to a directory: " + this.f94150a + " (" + this.f94151b + ")", e10);
            }
            throw new t("Error writing file: " + this.f94150a + " (" + this.f94151b + ")", e10);
        }
    }

    public a a(String str) {
        return this.f94150a.getPath().length() == 0 ? new a(this.f94152c, new File(str), this.f94151b) : new a(this.f94152c, new File(this.f94150a, str), this.f94151b);
    }

    public void d(a aVar) {
        boolean zO = o();
        if (!zO) {
            if (aVar.o()) {
                aVar = aVar.a(x());
            }
            c(this, aVar);
            return;
        }
        if (!aVar.l()) {
            aVar.v();
            if (!aVar.o()) {
                throw new t("Destination directory cannot be created: " + aVar);
            }
        } else if (!aVar.o()) {
            throw new t("Destination exists but is not a directory: " + aVar);
        }
        if (!zO) {
            aVar = aVar.a(x());
        }
        b(this, aVar);
    }

    public boolean e() {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot delete a classpath file: " + this.f94150a);
        }
        if (aVar != b.a.Internal) {
            return n().delete();
        }
        throw new t("Cannot delete an internal file: " + this.f94150a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f94151b == aVar.f94151b && A().equals(aVar.A());
    }

    public boolean f() {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot delete a classpath file: " + this.f94150a);
        }
        if (aVar != b.a.Internal) {
            return g(n());
        }
        throw new t("Cannot delete an internal file: " + this.f94150a);
    }

    public void h() {
        j(false);
    }

    public int hashCode() {
        return ((37 + this.f94151b.hashCode()) * 67) + A().hashCode();
    }

    public void j(boolean z10) {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot delete a classpath file: " + this.f94150a);
        }
        if (aVar != b.a.Internal) {
            i(n(), z10);
            return;
        }
        throw new t("Cannot delete an internal file: " + this.f94150a);
    }

    public boolean l() {
        int i10 = C0837a.f94153a[this.f94151b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return n().exists();
            }
        } else if (n().exists()) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/");
        sb2.append(this.f94150a.getPath().replace('\\', '/'));
        return a.class.getResource(sb2.toString()) != null;
    }

    public String m() {
        String name = this.f94150a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public File n() {
        return this.f94151b == b.a.External ? new File(this.f94152c.g(), this.f94150a.getPath()) : this.f94150a;
    }

    public boolean o() {
        if (this.f94151b == b.a.Classpath) {
            return false;
        }
        return n().isDirectory();
    }

    public long p() {
        return n().lastModified();
    }

    public long q() {
        b.a aVar = this.f94151b;
        if (aVar != b.a.Classpath && (aVar != b.a.Internal || this.f94150a.exists())) {
            return n().length();
        }
        InputStream inputStreamD = D();
        try {
            long jAvailable = inputStreamD.available();
            e1.a(inputStreamD);
            return jAvailable;
        } catch (Exception unused) {
            e1.a(inputStreamD);
            return 0L;
        } catch (Throwable th2) {
            e1.a(inputStreamD);
            throw th2;
        }
    }

    public a[] r() {
        if (this.f94151b == b.a.Classpath) {
            throw new t("Cannot list a classpath directory: " + this.f94150a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int length = list.length;
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = a(list[i10]);
        }
        return aVarArr;
    }

    public a[] s(FileFilter fileFilter) {
        if (this.f94151b == b.a.Classpath) {
            throw new t("Cannot list a classpath directory: " + this.f94150a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i10 = 0;
        for (String str : list) {
            a aVarA = a(str);
            if (fileFilter.accept(aVarA.n())) {
                aVarArr[i10] = aVarA;
                i10++;
            }
        }
        if (i10 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i10];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
        return aVarArr2;
    }

    public a[] t(FilenameFilter filenameFilter) {
        if (this.f94151b == b.a.Classpath) {
            throw new t("Cannot list a classpath directory: " + this.f94150a);
        }
        File fileN = n();
        String[] list = fileN.list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i10 = 0;
        for (String str : list) {
            if (filenameFilter.accept(fileN, str)) {
                aVarArr[i10] = a(str);
                i10++;
            }
        }
        if (i10 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i10];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
        return aVarArr2;
    }

    public String toString() {
        return this.f94150a.getPath().replace('\\', '/');
    }

    public a[] u(String str) {
        if (this.f94151b == b.a.Classpath) {
            throw new t("Cannot list a classpath directory: " + this.f94150a);
        }
        String[] list = n().list();
        if (list == null) {
            return new a[0];
        }
        a[] aVarArr = new a[list.length];
        int i10 = 0;
        for (String str2 : list) {
            if (str2.endsWith(str)) {
                aVarArr[i10] = a(str2);
                i10++;
            }
        }
        if (i10 >= list.length) {
            return aVarArr;
        }
        a[] aVarArr2 = new a[i10];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
        return aVarArr2;
    }

    public void v() {
        b.a aVar = this.f94151b;
        if (aVar == b.a.Classpath) {
            throw new t("Cannot mkdirs with a classpath file: " + this.f94150a);
        }
        if (aVar != b.a.Internal) {
            n().mkdirs();
            return;
        }
        throw new t("Cannot mkdirs with an internal file: " + this.f94150a);
    }

    public void w(a aVar) {
        b.a aVar2 = this.f94151b;
        if (aVar2 == b.a.Classpath) {
            throw new t("Cannot move a classpath file: " + this.f94150a);
        }
        if (aVar2 == b.a.Internal) {
            throw new t("Cannot move an internal file: " + this.f94150a);
        }
        d(aVar);
        e();
        if (l() && o()) {
            f();
        }
    }

    public String x() {
        return this.f94150a.getName();
    }

    public String y() {
        String name = this.f94150a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public a z() {
        File parentFile = this.f94150a.getParentFile();
        if (parentFile == null) {
            parentFile = this.f94151b == b.a.Absolute ? new File("/") : new File("");
        }
        return new a(this.f94152c, parentFile, this.f94151b);
    }

    public a(b bVar, String str) {
        this(bVar);
        this.f94150a = new File(str);
        this.f94151b = b.a.Absolute;
    }

    public a(b bVar, File file) {
        this(bVar);
        this.f94150a = file;
        this.f94151b = b.a.Absolute;
    }

    protected a(b bVar, String str, b.a aVar) {
        this(bVar);
        this.f94151b = aVar;
        this.f94150a = new File(str);
    }

    protected a(b bVar, File file, b.a aVar) {
        this(bVar);
        this.f94150a = file;
        this.f94151b = aVar;
    }
}
