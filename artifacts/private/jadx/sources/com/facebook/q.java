package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f101742a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f101743b = q.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f101744c = "content://com.facebook.app.FacebookContentProvider";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f101745d = "..";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final String a(@Nullable String str, @NotNull UUID callId, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            q1 q1Var = q1.f312784a;
            String str3 = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{q.f101744c, str, callId.toString(), str2}, 4));
            Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
            return str3;
        }

        private a() {
        }
    }

    @oj.n
    @NotNull
    public static final String a(@Nullable String str, @NotNull UUID uuid, @Nullable String str2) {
        return f101742a.a(str, uuid, str2);
    }

    private final Pair<UUID, String> b(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strSubstring = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = StringsKt.split$default(strSubstring, new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            String str = strArr[0];
            String str2 = strArr[1];
            if (f101745d.contentEquals(str) || f101745d.contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String mode) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Pair<UUID, String> pairB = b(uri);
        if (pairB == null) {
            throw new FileNotFoundException();
        }
        try {
            com.facebook.internal.u0 u0Var = com.facebook.internal.u0.f100117a;
            File fileJ = com.facebook.internal.u0.j((UUID) pairB.first, (String) pairB.second);
            if (fileJ != null) {
                return ParcelFileDescriptor.open(fileJ, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e10) {
            Intrinsics.stringPlus("Got unexpected exception:", e10);
            throw e10;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
