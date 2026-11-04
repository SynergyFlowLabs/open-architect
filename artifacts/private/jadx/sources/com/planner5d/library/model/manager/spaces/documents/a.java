package com.planner5d.library.model.manager.spaces.documents;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f197806d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f197807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f197808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f197809c;

    public a(@NotNull String uploadLink, @NotNull String uploadToken, int i10) {
        Intrinsics.checkNotNullParameter(uploadLink, "uploadLink");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        this.f197807a = uploadLink;
        this.f197808b = uploadToken;
        this.f197809c = i10;
    }

    public static /* synthetic */ a e(a aVar, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f197807a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f197808b;
        }
        if ((i11 & 4) != 0) {
            i10 = aVar.f197809c;
        }
        return aVar.d(str, str2, i10);
    }

    @NotNull
    public final String a() {
        return this.f197807a;
    }

    @NotNull
    public final String b() {
        return this.f197808b;
    }

    public final int c() {
        return this.f197809c;
    }

    @NotNull
    public final a d(@NotNull String uploadLink, @NotNull String uploadToken, int i10) {
        Intrinsics.checkNotNullParameter(uploadLink, "uploadLink");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        return new a(uploadLink, uploadToken, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f197807a, aVar.f197807a) && Intrinsics.areEqual(this.f197808b, aVar.f197808b) && this.f197809c == aVar.f197809c;
    }

    public final int f() {
        return this.f197809c;
    }

    @NotNull
    public final String g() {
        return this.f197807a;
    }

    @NotNull
    public final String h() {
        return this.f197808b;
    }

    public int hashCode() {
        return (((this.f197807a.hashCode() * 31) + this.f197808b.hashCode()) * 31) + Integer.hashCode(this.f197809c);
    }

    @NotNull
    public String toString() {
        return "DocumentUpload(uploadLink=" + this.f197807a + ", uploadToken=" + this.f197808b + ", maxSize=" + this.f197809c + ")";
    }
}
