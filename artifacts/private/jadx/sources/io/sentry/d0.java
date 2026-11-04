package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d0 implements x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f305322b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n1 f305323a;

    public d0(@NotNull n1 n1Var) {
        this.f305323a = n1Var;
    }

    @Nullable
    private h6 b(@NotNull byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f305322b));
        try {
            h6 h6Var = (h6) this.f305323a.c(stringReader, h6.class);
            stringReader.close();
            return h6Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Nullable
    private n7 c(@NotNull byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f305322b));
        try {
            n7 n7Var = (n7) this.f305323a.c(stringReader, n7.class);
            stringReader.close();
            return n7Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.x0
    @Nullable
    public g6 a(@NotNull InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                int i12 = inputStream.read(bArr);
                if (i12 <= 0) {
                    break;
                }
                for (int i13 = 0; i11 == -1 && i13 < i12; i13++) {
                    if (bArr[i13] == 10) {
                        i11 = i10 + i13;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i12);
                i10 += i12;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        h6 h6VarB = b(byteArray, 0, i11);
        if (h6VarB == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i14 = i11 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i15 = i14;
            while (true) {
                if (i15 >= byteArray.length) {
                    i15 = -1;
                    break;
                }
                if (byteArray[i15] == 10) {
                    break;
                }
                i15++;
            }
            if (i15 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            n7 n7VarC = c(byteArray, i14, i15 - i14);
            if (n7VarC == null || n7VarC.d() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int iD = n7VarC.d() + i15;
            int i16 = iD + 1;
            if (i16 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i16 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new m7(n7VarC, Arrays.copyOfRange(byteArray, i15 + 1, i16)));
            if (i16 == byteArray.length) {
                break;
            }
            i14 = iD + 2;
            if (i14 == byteArray.length) {
                if (byteArray[i16] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        g6 g6Var = new g6(h6VarB, arrayList);
        byteArrayOutputStream.close();
        return g6Var;
    }
}
