package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.w0;
import androidx.core.os.q0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
@w0(19)
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51288e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51289f = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final androidx.emoji2.text.flatbuffer.p f51290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final char[] f51291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final a f51292c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Typeface f51293d;

    @b1({b1.a.LIBRARY})
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f51294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r f51295b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray<a> sparseArray = this.f51294a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        final r b() {
            return this.f51295b;
        }

        void c(@NonNull r rVar, int i10, int i11) {
            a aVarA = a(rVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f51294a.put(rVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(rVar, i10 + 1, i11);
            } else {
                aVarA.f51295b = rVar;
            }
        }

        a(int i10) {
            this.f51294a = new SparseArray<>(i10);
        }
    }

    private p(@NonNull Typeface typeface, @NonNull androidx.emoji2.text.flatbuffer.p pVar) {
        this.f51293d = typeface;
        this.f51290a = pVar;
        this.f51291b = new char[pVar.K() * 2];
        a(pVar);
    }

    private void a(androidx.emoji2.text.flatbuffer.p pVar) {
        int iK = pVar.K();
        for (int i10 = 0; i10 < iK; i10++) {
            r rVar = new r(this, i10);
            Character.toChars(rVar.g(), this.f51291b, i10 * 2);
            k(rVar);
        }
    }

    @NonNull
    public static p b(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            q0.b(f51289f);
            return new p(Typeface.createFromAsset(assetManager, str), o.b(assetManager, str));
        } finally {
            q0.d();
        }
    }

    @NonNull
    @l1
    @b1({b1.a.LIBRARY})
    public static p c(@NonNull Typeface typeface) {
        try {
            q0.b(f51289f);
            return new p(typeface, new androidx.emoji2.text.flatbuffer.p());
        } finally {
            q0.d();
        }
    }

    @NonNull
    public static p d(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            q0.b(f51289f);
            return new p(typeface, o.c(inputStream));
        } finally {
            q0.d();
        }
    }

    @NonNull
    public static p e(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            q0.b(f51289f);
            p pVar = new p(typeface, o.d(byteBuffer));
            q0.d();
            return pVar;
        } catch (Throwable th2) {
            q0.d();
            throw th2;
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public char[] f() {
        return this.f51291b;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public androidx.emoji2.text.flatbuffer.p g() {
        return this.f51290a;
    }

    @b1({b1.a.LIBRARY})
    int h() {
        return this.f51290a.S();
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    a i() {
        return this.f51292c;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    Typeface j() {
        return this.f51293d;
    }

    @l1
    @b1({b1.a.LIBRARY})
    void k(@NonNull r rVar) {
        androidx.core.util.t.m(rVar, "emoji metadata cannot be null");
        androidx.core.util.t.b(rVar.c() > 0, "invalid metadata codepoint length");
        this.f51292c.c(rVar, 0, rVar.c() - 1);
    }
}
