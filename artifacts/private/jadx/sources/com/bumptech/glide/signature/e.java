package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.k;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f97455c;

    public e(@NonNull Object obj) {
        this.f97455c = k.d(obj);
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f97455c.toString().getBytes(g.f96793b));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f97455c.equals(((e) obj).f97455c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f97455c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f97455c + AbstractJsonLexerKt.END_OBJ;
    }
}
