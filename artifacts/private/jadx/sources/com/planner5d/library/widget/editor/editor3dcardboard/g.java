package com.planner5d.library.widget.editor.editor3dcardboard;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.t3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f255955d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f1 f255956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f255957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t1 f255958c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.editor3dcardboard.CardboardProjectLoader$load$1", f = "CardboardProjectLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f255959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f255960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f255961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f255962d;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor3dcardboard.g$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCardboardProjectLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardboardProjectLoader.kt\ncom/planner5d/library/widget/editor/editor3dcardboard/CardboardProjectLoader$load$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
        public static final class C1731a extends com.planner5d.library.services.rx.e<t3> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w f255963d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f255964e;

            C1731a(w wVar, g gVar) {
                this.f255963d = wVar;
                this.f255964e = gVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LogRecord e(Throwable th2) {
                return new LogRecord("cardboard_failed", null, th2);
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(final Throwable th2) {
                onCompleted();
                this.f255964e.f255958c.v(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.f
                    @Override // ij.c
                    public final Object get() {
                        return g.a.C1731a.e(th2);
                    }
                });
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public void onNext(t3 t3Var) {
                if (t3Var != null) {
                    this.f255963d.b(t3Var);
                }
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                this.f255963d.onComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, g gVar, Bundle bundle, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f255960b = wVar;
            this.f255961c = gVar;
            this.f255962d = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f255960b, this.f255961c, this.f255962d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f255959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f255960b.a()) {
                this.f255961c.f255957b.E(this.f255962d).subscribe((Subscriber<? super t3>) new C1731a(this.f255960b, this.f255961c));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g(@NotNull f1 coroutineScope, @NotNull n3 helperProjectPersistence, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f255956a = coroutineScope;
        this.f255957b = helperProjectPersistence;
        this.f255958c = logRecordManager;
    }

    public final void c(@NotNull w projectLoader, @NotNull Bundle arguments) {
        Intrinsics.checkNotNullParameter(projectLoader, "projectLoader");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        int i10 = (4 & 0) >> 0;
        kotlinx.coroutines.k.f(this.f255956a, null, null, new a(projectLoader, this, arguments, null), 3, null);
    }
}
