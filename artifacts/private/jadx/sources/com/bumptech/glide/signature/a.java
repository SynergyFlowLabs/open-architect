package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f97448d;

    private a(int i10, g gVar) {
        this.f97447c = i10;
        this.f97448d = gVar;
    }

    @NonNull
    public static g c(@NonNull Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        this.f97448d.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f97447c).array());
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f97447c == aVar.f97447c && this.f97448d.equals(aVar.f97448d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return m.p(this.f97448d, this.f97447c);
    }
}
