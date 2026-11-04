package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,228:1\n36#2:229\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper\n*L\n221#1:229\n*E\n"})
public final class r extends com.planner5d.library.activity.helper.imagechooser.e<Uri> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f137093h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f137094i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f137095j = 512;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.z f137096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Activity f137097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Subscriber<? super Uri> f137098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private volatile qa.e f137099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Pair<Integer, Intent> f137100g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.FileHelper$deleteFile$2", f = "FileHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$deleteFile$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,228:1\n29#2:229\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$deleteFile$2\n*L\n146#1:229\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f137102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f137103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, r rVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f137102b = str;
            this.f137103c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f137102b, this.f137103c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContentResolver contentResolver;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f137101a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                Uri uri = Uri.parse(this.f137102b);
                Activity activity = this.f137103c.f137097d;
                if (activity == null || (contentResolver = activity.getContentResolver()) == null) {
                    throw new RuntimeException("Activity is null");
                }
                return kotlin.coroutines.jvm.internal.b.a(this.f137103c.f137096c.a(this.f137103c.x(contentResolver, uri, "")).delete());
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Error while trying to delete file with uri:" + this.f137102b, new Object[0]);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.FileHelper$getFileBytes$2", f = "FileHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$getFileBytes$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,228:1\n29#2:229\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$getFileBytes$2\n*L\n158#1:229\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f137105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f137106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, r rVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f137105b = str;
            this.f137106c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f137105b, this.f137106c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContentResolver contentResolver;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f137104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                Uri uri = Uri.parse(this.f137105b);
                Activity activity = this.f137106c.f137097d;
                if (activity == null || (contentResolver = activity.getContentResolver()) == null) {
                    throw new RuntimeException("Activity is null");
                }
                FileInputStream fileInputStreamC = this.f137106c.f137096c.c(this.f137106c.x(contentResolver, uri, ""));
                try {
                    byte[] bArrP = kotlin.io.b.p(fileInputStreamC);
                    kotlin.io.c.a(fileInputStreamC, null);
                    return bArrP;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(fileInputStreamC, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                timber.log.b.f381052a.f(th4, "Error while trying to delete file with uri:" + this.f137105b, new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.FileHelper$saveUserFileToInternalStorage$2", f = "FileHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$saveUserFileToInternalStorage$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,228:1\n29#2:229\n36#2:230\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/planner5d/library/activity/helper/FileHelper$saveUserFileToInternalStorage$2\n*L\n126#1:229\n136#1:230\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f137108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f137109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, r rVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f137108b = str;
            this.f137109c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f137108b, this.f137109c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContentResolver contentResolver;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f137107a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                Uri uri = Uri.parse(this.f137108b);
                Activity activity = this.f137109c.f137097d;
                if (activity == null || (contentResolver = activity.getContentResolver()) == null) {
                    throw new RuntimeException("Activity is null");
                }
                String str = "COPIED_FILE_" + this.f137109c.x(contentResolver, uri, "");
                File fileA = this.f137109c.f137096c.a(str);
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                FileOutputStream fileOutputStreamD = this.f137109c.f137096c.d(str);
                Long lG = inputStreamOpenInputStream != null ? kotlin.coroutines.jvm.internal.b.g(kotlin.io.b.l(inputStreamOpenInputStream, fileOutputStreamD, 0, 2, null)) : null;
                timber.log.b.f381052a.x("COPIED " + lG + " bytes", new Object[0]);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                fileOutputStreamD.close();
                return Uri.fromFile(fileA).toString();
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Error while copying file with uri:" + this.f137108b + " to local storage", new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull com.planner5d.library.services.z privateFiles) {
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        this.f137096c = privateFiles;
    }

    private final void B() {
        final Subscriber<? super Uri> subscriber;
        Pair<Integer, Intent> pair = this.f137100g;
        if (this.f137097d != null && (subscriber = this.f137098e) != null && pair != null) {
            Integer num = (Integer) pair.first;
            if (num != null && num.intValue() == -1) {
                final Uri uriG = g(pair);
                com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.activity.helper.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.C(subscriber, uriG, this);
                    }
                }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
                return;
            }
            this.f137098e = null;
            if (subscriber != null) {
                subscriber.onCompleted();
            }
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Subscriber subscriber, Uri uri, r rVar) {
        if (subscriber != null) {
            try {
                try {
                    subscriber.onNext(uri);
                } catch (Exception e10) {
                    if (subscriber != null) {
                        subscriber.onError(e10);
                    }
                    rVar.u();
                    return;
                }
            } catch (Throwable th2) {
                rVar.u();
                throw th2;
            }
        }
        if (subscriber != null) {
            subscriber.onCompleted();
        }
        rVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable H(final r rVar, final Intent intent) {
        Observable observableCreate = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.p
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                r.I(this.f137078a, intent, (Subscriber) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(r rVar, Intent intent, Subscriber subscriber) {
        rVar.f137098e = subscriber;
        Activity activity = rVar.f137097d;
        if (activity != null) {
            activity.startActivityForResult(intent, 3);
        }
    }

    public static /* synthetic */ String L(r rVar, String str, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
            int i11 = 6 << 0;
        }
        return rVar.K(str, bArr);
    }

    private final void u() {
        this.f137099f = null;
        this.f137100g = null;
    }

    private final String y(Uri uri, Context context) {
        if (Intrinsics.areEqual(FirebaseAnalytics.d.P, uri.getScheme())) {
            return context.getContentResolver().getType(uri);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNull(fileExtensionFromUrl);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public final void A(int i10, int i11, @Nullable Intent intent) {
        this.f137100g = new Pair<>(Integer.valueOf(i11), intent);
        if (i10 == 3) {
            B();
        }
    }

    @NotNull
    public final kotlin.Pair<FileOutputStream, Uri> D(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return TuplesKt.to(this.f137096c.d(name), Uri.fromFile(this.f137096c.a(name)));
    }

    public final void E() {
        this.f137097d = null;
    }

    @Nullable
    public final String F(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            FileInputStream fileInputStreamC = this.f137096c.c(name);
            try {
                String str = new String(kotlin.io.b.p(fileInputStreamC), Charsets.UTF_8);
                kotlin.io.c.a(fileInputStreamC, null);
                return str;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(fileInputStreamC, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            timber.log.b.f381052a.f(th4, "Error reading text file " + name, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final Observable<Uri> G(@NotNull qa.e strategy, @Nullable IntentSender intentSender) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f137099f = strategy;
        return n(strategy, intentSender, this.f137097d, new Function1() { // from class: com.planner5d.library.activity.helper.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.H(this.f137074a, (Intent) obj);
            }
        });
    }

    public final void J(@Nullable Activity activity) {
        this.f137097d = activity;
        B();
    }

    @Nullable
    public final String K(@Nullable String str, @NotNull byte[] data) {
        String str2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (str == null) {
            str2 = "text_" + System.currentTimeMillis();
        } else {
            str2 = str;
        }
        String str3 = str2 + ".txt";
        try {
            FileOutputStream fileOutputStreamD = this.f137096c.d(str3);
            fileOutputStreamD.write(data);
            fileOutputStreamD.close();
            return str3;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Error saving text file " + str, new Object[0]);
            return null;
        }
    }

    @Nullable
    public final Object M(@NotNull String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new d(str, this, null), dVar);
    }

    @Nullable
    public final Object v(@NotNull String str, @NotNull kotlin.coroutines.d<Object> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(str, this, null), dVar);
    }

    @Nullable
    public final Object w(@NotNull String str, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new c(str, this, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    @androidx.annotation.m1
    @NotNull
    public final String x(@NotNull ContentResolver contentResolver, @NotNull Uri uri, @NotNull String defaultFileName) throws IOException {
        String string;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(defaultFileName, "defaultFileName");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                if (columnIndex < 0 || !cursorQuery.moveToNext()) {
                    string = null;
                } else {
                    string = cursorQuery.getString(columnIndex);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            string = null;
        }
        Unit unit = Unit.f312394a;
        kotlin.io.c.a(cursorQuery, null);
        if (string == null && uri.getPath() != null) {
            string = uri.getLastPathSegment();
        }
        return string == null ? defaultFileName : string;
    }

    @Nullable
    public final Bitmap z(@NotNull Context context, @NotNull Uri fileUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        String strY = y(fileUri, context);
        if (strY == null) {
            return null;
        }
        try {
            com.planner5d.library.activity.helper.imagechooser.m mVar = new com.planner5d.library.activity.helper.imagechooser.m(512, false, false);
            if (StringsKt.V2(strY, "pdf", false, 2, null)) {
                return new qa.f().b(context, fileUri, mVar);
            }
            if (StringsKt.V2(strY, "image", false, 2, null)) {
                return new qa.c(false, null, 3, null).b(context, fileUri, mVar);
            }
            return null;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Error while loading file preview for " + fileUri, new Object[0]);
        }
    }
}
