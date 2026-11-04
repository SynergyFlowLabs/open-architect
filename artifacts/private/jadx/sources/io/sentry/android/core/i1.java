package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
abstract class i1 extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.k f304204a = new io.sentry.android.core.internal.util.k();

    i1() {
    }

    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        this.f304204a.a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        this.f304204a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        this.f304204a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        this.f304204a.a(this);
        return 0;
    }
}
