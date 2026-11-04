package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.resource.bitmap.b0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f96783a = 5242880;

    class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f96784a;

        a(InputStream inputStream) {
            this.f96784a = inputStream;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f96784a);
            } finally {
                this.f96784a.reset();
            }
        }
    }

    class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f96785a;

        b(ByteBuffer byteBuffer) {
            this.f96785a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.d(this.f96785a);
        }
    }

    class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.data.m f96786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f96787b;

        c(com.bumptech.glide.load.data.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f96786a = mVar;
            this.f96787b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            b0 b0Var = null;
            try {
                b0 b0Var2 = new b0(new FileInputStream(this.f96786a.a().getFileDescriptor()), this.f96787b);
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(b0Var2);
                    try {
                        b0Var2.close();
                    } catch (IOException unused) {
                    }
                    this.f96786a.a();
                    return imageTypeB;
                } catch (Throwable th2) {
                    th = th2;
                    b0Var = b0Var2;
                    if (b0Var != null) {
                        try {
                            b0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f96786a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    class d implements InterfaceC0863f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f96788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f96789b;

        d(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f96788a = inputStream;
            this.f96789b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0863f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                int iC = imageHeaderParser.c(this.f96788a, this.f96789b);
                this.f96788a.reset();
                return iC;
            } catch (Throwable th2) {
                this.f96788a.reset();
                throw th2;
            }
        }
    }

    class e implements InterfaceC0863f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.data.m f96790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f96791b;

        e(com.bumptech.glide.load.data.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f96790a = mVar;
            this.f96791b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0863f
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            b0 b0Var = null;
            try {
                b0 b0Var2 = new b0(new FileInputStream(this.f96790a.a().getFileDescriptor()), this.f96791b);
                try {
                    int iC = imageHeaderParser.c(b0Var2, this.f96791b);
                    try {
                        b0Var2.close();
                    } catch (IOException unused) {
                    }
                    this.f96790a.a();
                    return iC;
                } catch (Throwable th2) {
                    th = th2;
                    b0Var = b0Var2;
                    if (b0Var != null) {
                        try {
                            b0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f96790a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.f$f, reason: collision with other inner class name */
    private interface InterfaceC0863f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private f() {
    }

    @w0(21)
    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull com.bumptech.glide.load.data.m mVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return c(list, new e(mVar, bVar));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, @p0 InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new b0(inputStream, bVar);
        }
        inputStream.mark(f96783a);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(@NonNull List<ImageHeaderParser> list, InterfaceC0863f interfaceC0863f) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = interfaceC0863f.a(list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    @NonNull
    @w0(21)
    public static ImageHeaderParser.ImageType d(@NonNull List<ImageHeaderParser> list, @NonNull com.bumptech.glide.load.data.m mVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return g(list, new c(mVar, bVar));
    }

    @NonNull
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @p0 InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new b0(inputStream, bVar);
        }
        inputStream.mark(f96783a);
        return g(list, new a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, @p0 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    @NonNull
    private static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = gVar.a(list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
