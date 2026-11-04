package com.segment.analytics.kotlin.core.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(message = "Deprecated in favor of EventStream")
@SourceDebugExtension({"SMAP\nEventsFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventsFileManager.kt\ncom/segment/analytics/kotlin/core/utilities/EventsFileManager\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,187:1\n26#2:188\n11335#3:189\n11670#3,3:190\n*S KotlinDebug\n*F\n+ 1 EventsFileManager.kt\ncom/segment/analytics/kotlin/core/utilities/EventsFileManager\n*L\n104#1:188\n105#1:189\n105#1:190,3\n*E\n"})
public final class i {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f266986h = 475000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f266987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f266989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f266990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private FileOutputStream f266991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private File f266992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.h f266993g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            FileOutputStream fileOutputStream = i.this.f266991e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    static final class c extends l0 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws IOException {
            i.this.i();
        }
    }

    static final class d extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f266997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.f266997b = str;
            int i10 = 0 << 0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws IOException {
            boolean z10;
            File fileH = i.this.h();
            boolean z11 = true;
            if (fileH.exists()) {
                z10 = false;
            } else {
                fileH.createNewFile();
                i.this.r(fileH);
                z10 = true;
            }
            if (fileH.length() > 475000) {
                i.this.i();
                fileH = i.this.h();
                fileH.createNewFile();
                i.this.r(fileH);
            } else {
                z11 = z10;
            }
            String str = "";
            if (!z11) {
                str = "" + AbstractJsonLexerKt.COMMA;
            }
            String str2 = str + this.f266997b;
            i iVar = i.this;
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            iVar.u(bytes, fileH);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.utilities.EventsFileManager", f = "EventsFileManager.kt", i = {0, 0}, l = {183}, m = "withLock", n = {"this", "block"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f267000c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f267002e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f267000c = obj;
            this.f267002e |= Integer.MIN_VALUE;
            return i.this.t(null, this);
        }
    }

    public i(@NotNull File directory, @NotNull String writeKey, @NotNull p kvs, @Nullable String str) throws IOException {
        StringBuilder sb2;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(kvs, "kvs");
        this.f266987a = directory;
        this.f266988b = writeKey;
        this.f266989c = kvs;
        k.a(directory);
        n();
        if (str == null) {
            sb2 = new StringBuilder();
            sb2.append("segment.events.file.index.");
            sb2.append(writeKey);
        } else {
            sb2 = new StringBuilder();
            sb2.append("segment.events.file.index.");
            sb2.append(writeKey);
            sb2.append('.');
            sb2.append(str);
        }
        this.f266990d = sb2.toString();
        this.f266993g = kotlinx.coroutines.sync.l.b(1, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File h() {
        File file = this.f266992f;
        if (file == null) {
            int i10 = this.f266989c.getInt(this.f266990d, 0);
            file = new File(this.f266987a, this.f266988b + org.apache.commons.codec.language.l.f335457d + i10 + ".tmp");
        }
        this.f266992f = file;
        Intrinsics.checkNotNull(file);
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() throws IOException {
        File fileH = h();
        if (fileH.exists()) {
            byte[] bytes = ("],\"sentAt\":\"" + r.Companion.b() + "\",\"writeKey\":\"" + this.f266988b + "\"}").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            u(bytes, fileH);
            fileH.renameTo(new File(this.f266987a, kotlin.io.l.d0(fileH)));
            FileOutputStream fileOutputStream = this.f266991e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            k();
            p();
        }
    }

    private final boolean k() {
        return this.f266989c.putInt(this.f266990d, this.f266989c.getInt(this.f266990d, 0) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(i this$0, File file, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return StringsKt.V2(name, this$0.f266988b, false, 2, null) && !StringsKt.M1(name, ".tmp", false, 2, null);
    }

    private final void n() {
        Runtime.getRuntime().addShutdownHook(new b());
    }

    private final void p() {
        this.f266991e = null;
        this.f266992f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(File file) throws IOException {
        byte[] bytes = "{\"batch\":[".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        u(bytes, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object t(Function0<Unit> function0, kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f267002e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f267002e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f267000c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f267002e;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.h hVar = this.f266993g;
            eVar.f266998a = this;
            eVar.f266999b = function0;
            eVar.f267002e = 1;
            if (hVar.g(eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) eVar.f266999b;
            this = (i) eVar.f266998a;
            ResultKt.m(obj);
        }
        function0.invoke();
        this.f266993g.release();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(byte[] bArr, File file) throws IOException {
        FileOutputStream fileOutputStream = this.f266991e;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, true);
        }
        this.f266991e = fileOutputStream;
        fileOutputStream.write(bArr);
        fileOutputStream.flush();
    }

    @NotNull
    public final File j() {
        return this.f266987a;
    }

    @NotNull
    public final List<String> l() {
        File[] fileArrListFiles = this.f266987a.listFiles(new FilenameFilter() { // from class: com.segment.analytics.kotlin.core.utilities.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return i.m(this.f266985a, file, str);
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean o(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new File(filePath).delete();
    }

    @Nullable
    public final Object q(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objT = t(new c(), dVar);
        return objT == kotlin.coroutines.intrinsics.b.l() ? objT : Unit.f312394a;
    }

    @Nullable
    public final Object s(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objT = t(new d(str), dVar);
        return objT == kotlin.coroutines.intrinsics.b.l() ? objT : Unit.f312394a;
    }

    public /* synthetic */ i(File file, String str, p pVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, str, pVar, (i10 & 8) != 0 ? null : str2);
    }
}
