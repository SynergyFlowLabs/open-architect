package com.canhub.cropper.core;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f97754a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f97755b = "crop:";

    public static final class a extends d {
        public a() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.core.d$d, reason: collision with other inner class name */
    public static final class C0880d extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0880d(@NotNull Uri uri, @Nullable String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private d(String str) {
        super(str);
    }
}
