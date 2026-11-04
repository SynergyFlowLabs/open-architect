package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@w0(api = 28)
public abstract class a<T> implements l<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f96938b = "ImageDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w f96939a = w.a();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.a$a, reason: collision with other inner class name */
    class C0868a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f96940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f96941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.b f96943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f96944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f96945f;

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.a$a$a, reason: collision with other inner class name */
        class C0869a implements ImageDecoder.OnPartialImageListener {
            C0869a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0868a(int i10, int i11, boolean z10, com.bumptech.glide.load.b bVar, p pVar, k kVar) {
            this.f96940a = i10;
            this.f96941b = i11;
            this.f96942c = z10;
            this.f96943d = bVar;
            this.f96944e = pVar;
            this.f96945f = kVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @e.a({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (a.this.f96939a.c(this.f96940a, this.f96941b, this.f96942c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f96943d == com.bumptech.glide.load.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0869a());
            Size size = imageInfo.getSize();
            int width = this.f96940a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f96941b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fB = this.f96944e.b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fB);
            int iRound2 = Math.round(fB * size.getHeight());
            if (Log.isLoggable(a.f96938b, 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            imageDecoder.setTargetColorSpace(ColorSpace.get((this.f96945f == k.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    protected abstract v<T> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // com.bumptech.glide.load.l
    @p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final v<T> b(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull j jVar) throws IOException {
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) jVar.c(q.f97059g);
        p pVar = (p) jVar.c(p.f97053h);
        i<Boolean> iVar = q.f97063k;
        return c(source, i10, i11, new C0868a(i10, i11, jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue(), bVar, pVar, (k) jVar.c(q.f97060h)));
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean a(@NonNull ImageDecoder.Source source, @NonNull j jVar) {
        return true;
    }
}
