package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Closeable {
    private static final long X = -1;
    private static final String Y = "MultiDex.lock";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f70583g = "MultiDex";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f70584h = "classes";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f70585i = ".dex";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f70586j = ".classes";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f70587k = ".zip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f70588l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f70589m = "multidex.version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f70590n = "timestamp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f70591o = "crc";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f70592s = "dex.number";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f70593t = "dex.crc.";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f70594v = "dex.time.";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f70595w = 16384;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f70596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f70597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f70598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RandomAccessFile f70599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FileChannel f70600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileLock f70601f;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(d.Y);
        }
    }

    private static class b extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f70603a;

        public b(File file, String str) {
            super(file, str);
            this.f70603a = -1L;
        }
    }

    d(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.f70596a = file;
        this.f70598c = file2;
        this.f70597b = f(file);
        File file3 = new File(file2, Y);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f70599d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f70600e = channel;
            try {
                file3.getPath();
                this.f70601f = channel.lock();
                file3.getPath();
            } catch (IOException | Error | RuntimeException e10) {
                b(this.f70600e);
                throw e10;
            }
        } catch (IOException | Error | RuntimeException e11) {
            b(this.f70599d);
            throw e11;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f70598c.listFiles(new a());
        if (fileArrListFiles == null) {
            this.f70598c.getPath();
            return;
        }
        for (File file : fileArrListFiles) {
            file.getPath();
            file.length();
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, f70587k, file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                file.getPath();
                if (fileCreateTempFile.renameTo(file)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences(f70589m, 4);
    }

    private static long e(File file) {
        long jLastModified = file.lastModified();
        if (jLastModified == -1) {
            jLastModified--;
        }
        return jLastModified;
    }

    private static long f(File file) throws IOException {
        long jC = f.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean g(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesD = d(context);
        if (sharedPreferencesD.getLong(str + "timestamp", -1L) == e(file)) {
            if (sharedPreferencesD.getLong(str + f70591o, -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    private List<b> j(Context context, String str) throws IOException {
        String str2 = this.f70596a.getName() + f70586j;
        SharedPreferences sharedPreferencesD = d(context);
        int i10 = sharedPreferencesD.getInt(str + f70592s, 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f70598c, str2 + i11 + f70587k);
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f70603a = f(bVar);
            long j10 = sharedPreferencesD.getLong(str + f70593t + i11, -1L);
            long j11 = sharedPreferencesD.getLong(str + f70594v + i11, -1L);
            long jLastModified = bVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesD;
                if (j10 == bVar.f70603a) {
                    arrayList.add(bVar);
                    i11++;
                    sharedPreferencesD = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f70603a);
        }
        return arrayList;
    }

    private List<b> l() throws IOException {
        String str = this.f70596a.getName() + f70586j;
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f70596a);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f70584h);
            int i10 = 2;
            sb2.append(2);
            sb2.append(f70585i);
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                b bVar = new b(this.f70598c, str + i10 + f70587k);
                arrayList.add(bVar);
                bVar.toString();
                int i11 = 0;
                boolean z10 = false;
                while (i11 < 3 && !z10) {
                    i11++;
                    c(zipFile, entry, bVar, str);
                    try {
                        bVar.f70603a = f(bVar);
                        z10 = true;
                    } catch (IOException unused) {
                        bVar.getAbsolutePath();
                        z10 = false;
                    }
                    bVar.getAbsolutePath();
                    bVar.length();
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            bVar.getPath();
                        }
                    }
                }
                if (!z10) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry(f70584h + i10 + f70585i);
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th2;
        }
    }

    private static void m(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + f70591o, j11);
        editorEdit.putInt(str + f70592s, list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + f70593t + i10, bVar.f70603a);
            editorEdit.putLong(str + f70594v + i10, bVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70601f.release();
        this.f70600e.close();
        this.f70599d.close();
    }

    List<? extends File> h(Context context, String str, boolean z10) throws IOException {
        List<b> listL;
        List<b> listJ;
        this.f70596a.getPath();
        if (!this.f70601f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !g(context, this.f70596a, this.f70597b, str)) {
            try {
                listJ = j(context, str);
            } catch (IOException unused) {
                listL = l();
                m(context, str, e(this.f70596a), this.f70597b, listL);
                listJ = listL;
            }
            listJ.size();
            return listJ;
        }
        listL = l();
        m(context, str, e(this.f70596a), this.f70597b, listL);
        listJ = listL;
        listJ.size();
        return listJ;
    }
}
