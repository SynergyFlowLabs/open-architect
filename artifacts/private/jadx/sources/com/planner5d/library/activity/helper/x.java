package com.planner5d.library.activity.helper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@ij.f
@SourceDebugExtension({"SMAP\nHelperExportImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperExportImage.kt\ncom/planner5d/library/activity/helper/HelperExportImage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137191b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f137193d = 70;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f137194e = "image/jpeg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f137190a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Bitmap.CompressFormat f137192c = Bitmap.CompressFormat.JPEG;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bitmap.CompressFormat a() {
            return x.f137192c;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.HelperExportImage$exportImageToGallerySilently$2", f = "HelperExportImage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Uri>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f137197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f137198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f137199e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Bitmap bitmap, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f137197c = context;
            this.f137198d = bitmap;
            this.f137199e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new b(this.f137197c, this.f137198d, this.f137199e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f137195a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return x.this.d(this.f137197c, this.f137198d, this.f137199e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Uri> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final Uri d(Context context, Bitmap bitmap, String str) throws IOException {
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        contentValues.put("is_pending", (Integer) 1);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        int i10 = 4 & 0;
        ?? OpenOutputStream = uriInsert != null ? contentResolver.openOutputStream(uriInsert) : 0;
        hVar.f312751a = OpenOutputStream;
        if (OpenOutputStream != 0) {
            try {
                bitmap.compress(f137192c, 70, OpenOutputStream);
                kotlin.io.c.a(OpenOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(OpenOutputStream, th2);
                    throw th3;
                }
            }
        }
        contentValues.clear();
        contentValues.put("is_pending", (Integer) 0);
        if (uriInsert != null) {
            contentResolver.update(uriInsert, contentValues, null, null);
        }
        return uriInsert;
    }

    @Nullable
    public final Object c(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(context, bitmap, "IMG_" + str + ".jpg", null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
