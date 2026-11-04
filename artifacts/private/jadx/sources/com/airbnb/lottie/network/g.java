package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final e f88633a;

    public g(@NonNull e eVar) {
        this.f88633a = eVar;
    }

    private static String c(String str, c cVar, boolean z10) {
        String strL = z10 ? cVar.l() : cVar.f88632a;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strL.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = e(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strL;
    }

    @p0
    private File d(String str) throws FileNotFoundException {
        File file = new File(f(), c(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(f(), c(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(f(), c(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private static String e(String str, int i10) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    private File f() {
        File fileA = this.f88633a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public void a() {
        File fileF = f();
        if (fileF.exists()) {
            File[] fileArrListFiles = fileF.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            fileF.delete();
        }
    }

    @m1
    @p0
    Pair<c, InputStream> b(String str) {
        c cVar;
        try {
            File fileD = d(str);
            if (fileD == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileD);
            if (fileD.getAbsolutePath().endsWith(".zip")) {
                cVar = c.ZIP;
            } else {
                cVar = fileD.getAbsolutePath().endsWith(".gz") ? c.GZIP : c.JSON;
            }
            com.airbnb.lottie.utils.d.a("Cache hit for " + str + " at " + fileD.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void g(String str, c cVar) {
        File file = new File(f(), c(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.d.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        com.airbnb.lottie.utils.d.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File h(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(f(), c(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }
}
