package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f225282a = new j0();

    private static final class a extends timber.log.b.a {
        @Override // timber.log.b.a, timber.log.b.c
        protected void p(int i10, @Nullable String str, @NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (str == null) {
                str = com.planner5d.library.model.payments.a.f222474i;
            }
            super.p(i10, "P5D." + str, message, th2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.DebugUtils$initializeLogger$1", f = "DebugUtils.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.u1 f225284b;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.manager.u1 f225285a;

            a(com.planner5d.library.model.manager.u1 u1Var) {
                this.f225285a = u1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Exception exc, kotlin.coroutines.d<? super Unit> dVar) {
                this.f225285a.b("coroutine", null, exc);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.model.manager.u1 u1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f225284b = u1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f225284b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f225283a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<Exception> iVarM = c0.f225068a.m();
                a aVar = new a(this.f225284b);
                this.f225283a = 1;
                if (iVarM.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private j0() {
    }

    public static /* synthetic */ void b(j0 j0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        j0Var.a(str, function0);
    }

    public static /* synthetic */ Throwable d(j0 j0Var, String str, Function0 executable, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(executable, "executable");
        try {
            executable.invoke();
            if (str == null) {
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                str = "Expected " + Throwable.class.getSimpleName() + " to be thrown, but nothing was thrown";
            }
            throw new AssertionError(str);
        } catch (Throwable th2) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            return th2;
        }
    }

    @oj.n
    @NotNull
    public static final JSONObject e() {
        try {
            return new JSONObject(StringsKt.p("\n                {\n\t\t\t\t\"items\": {\n                    \"uri\": \"https://p5d.eu/datafile/datafile/android/1752041811\",\n                    \"version\": \"1752041811\",\n                    \"hash\": \"3199b0ed9321dae50500b155ba2e148e\",\n                    \"uris\": [\n                        \"https://p5d.eu/datafile/datafile/android/1752041811\"\n                    ]\n\t\t\t\t},\n\t\t\t\t\"renderer\": {\n                    \"hash\": \"3268c5185048b582979983e91cc0dc9d\",\n                    \"size\": 27941296,\n                    \"uri\": \"https://static.planner5d.com/datafile/android/binaries/cycles_4_arm\"\n\t\t\t\t},\n\t\t\t\t\"materials\": {\n                    \"uri\": \"https://static.planner5d.com/datafile/c/materials\",\n                    \"uris\": [\n                        \"https://static.planner5d.com/datafile/c/materials\",\n                        \"https://assets.pl5d.com/c/materials\",\n                        \"https://secondary.p5d.eu/c/materials\",\n                        \"https://pl5d.com/c/materials\",\n                        \"http://secondary.p5d.eu/c/materials\"\n                    ]\n\t\t\t\t},\n\t\t\t\t\"iadattribution\": {\n                    \"uris\": [\n                        \"https://static.planner5d.com/datafile/ios/iadattribution.json\",\n                        \"https://assets.pl5d.com/ios/iadattribution.json\",\n                        \"https://secondary.p5d.eu/ios/iadattribution.json\",\n                        \"https://pl5d.com/ios/iadattribution.json\"\n                    ]\n\t\t\t\t},\n\t\t\t\t\"error\": 0,\n\t\t\t\t\"copyright\": \"Planner 5D®© 2011—2025\"\n\t\t\t\t}\t\t\t\n\t\t\t\t"));
        } catch (JSONException unused) {
            throw new RuntimeException("Should not happen");
        }
    }

    @oj.n
    public static final void f() {
    }

    @oj.n
    public static final void g(@NotNull f1 scope, @NotNull com.planner5d.library.model.manager.u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        kotlinx.coroutines.k.f(scope, null, null, new b(logRecordManager, null), 3, null);
    }

    public final void a(@Nullable String str, @NotNull Function0<Unit> executable) {
        Intrinsics.checkNotNullParameter(executable, "executable");
        try {
            executable.invoke();
        } catch (Throwable th2) {
            if (str == null) {
                str = "Expected no exception, but " + th2.getClass().getSimpleName() + " was thrown";
            }
            throw new AssertionError(str, th2);
        }
    }

    public final /* synthetic */ <T extends Throwable> T c(String str, Function0<Unit> executable) {
        Intrinsics.checkNotNullParameter(executable, "executable");
        try {
            executable.invoke();
            if (str == null) {
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                str = "Expected " + Throwable.class.getSimpleName() + " to be thrown, but nothing was thrown";
            }
            throw new AssertionError(str);
        } catch (Throwable th2) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            return th2;
        }
    }
}
