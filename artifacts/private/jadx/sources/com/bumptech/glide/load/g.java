package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f96792a = "UTF-8";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f96793b = Charset.forName("UTF-8");

    void b(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
