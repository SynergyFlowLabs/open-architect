package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
@i(generateAdapter = true)
public final class ProjectInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230153b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f230154a;

    public ProjectInfo(@g(name = "background_image") @Nullable String str) {
        this.f230154a = str;
    }

    @Nullable
    public final String a() {
        return this.f230154a;
    }
}
