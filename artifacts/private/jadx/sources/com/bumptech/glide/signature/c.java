package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f97451c = new c();

    private c() {
    }

    @NonNull
    public static c c() {
        return f97451c;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
