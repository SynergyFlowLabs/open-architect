package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.database.model.AutoStyle;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nLoadAutoStylesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadAutoStylesInteractor.kt\ncom/planner5d/library/dgenerator/interactor/LoadAutoStylesInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n774#2:69\n865#2,2:70\n*S KotlinDebug\n*F\n+ 1 LoadAutoStylesInteractor.kt\ncom/planner5d/library/dgenerator/interactor/LoadAutoStylesInteractor\n*L\n59#1:69\n59#1:70,2\n*E\n"})
public final class k implements nb.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f160443d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f160444e = 300000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final nb.h f160446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.dgenerator.data.a f160447c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.LoadAutoStylesInteractor$loadAutoStyles$1", f = "LoadAutoStylesInteractor.kt", i = {0, 0, 1, 1}, l = {25, 28}, m = "invokeSuspend", n = {"$this$channelFlow", AttributeType.LIST, "$this$channelFlow", "index$iv"}, s = {"L$0", "L$1", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nLoadAutoStylesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadAutoStylesInteractor.kt\ncom/planner5d/library/dgenerator/interactor/LoadAutoStylesInteractor$loadAutoStyles$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1872#2,3:69\n*S KotlinDebug\n*F\n+ 1 LoadAutoStylesInteractor.kt\ncom/planner5d/library/dgenerator/interactor/LoadAutoStylesInteractor$loadAutoStyles$1\n*L\n27#1:69,3\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super com.planner5d.library.dgenerator.fragment.list.r>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f160449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f160450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f160451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f160452e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f160454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f160455h;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoStyle f160456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0<com.planner5d.library.dgenerator.fragment.list.r> f160457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f160458c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f160459d;

            /* JADX WARN: Multi-variable type inference failed */
            a(AutoStyle autoStyle, l0<? super com.planner5d.library.dgenerator.fragment.list.r> l0Var, k kVar, int i10) {
                this.f160456a = autoStyle;
                this.f160457b = l0Var;
                this.f160458c = kVar;
                this.f160459d = i10;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AutoStyle autoStyle, kotlin.coroutines.d<? super Unit> dVar) {
                timber.log.b.f381052a.a("AutoStyle collected status=" + autoStyle.t() + " progress " + this.f160456a.w(), new Object[0]);
                Object objG = this.f160457b.G(new com.planner5d.library.dgenerator.fragment.list.r(this.f160458c.i(), kotlin.coroutines.jvm.internal.b.f(this.f160459d)), dVar);
                return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f160454g = num;
            this.f160455h = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = k.this.new b(this.f160454g, this.f160455h, dVar);
            bVar.f160452e = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x00aa A[LOOP:0: B:18:0x0079->B:26:0x00aa, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listI;
            l0 l0Var;
            k kVar;
            int i10;
            l0 l0Var2;
            Iterator it;
            int i11;
            kotlinx.coroutines.flow.i iVarK;
            a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f160451d;
            boolean z10 = !true;
            if (i12 == 0) {
                ResultKt.m(obj);
                l0 l0Var3 = (l0) this.f160452e;
                listI = k.this.i();
                com.planner5d.library.dgenerator.fragment.list.r rVar = new com.planner5d.library.dgenerator.fragment.list.r(listI, this.f160454g);
                this.f160452e = l0Var3;
                this.f160448a = listI;
                this.f160451d = 1;
                if (l0Var3.G(rVar, this) != objL) {
                    l0Var = l0Var3;
                }
                return objL;
            }
            if (i12 == 1) {
                listI = (List) this.f160448a;
                l0Var = (l0) this.f160452e;
                ResultKt.m(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f160450c;
                it = (Iterator) this.f160449b;
                k kVar2 = (k) this.f160448a;
                l0Var2 = (l0) this.f160452e;
                ResultKt.m(obj);
                kVar = kVar2;
                i10 = i13;
            }
            while (it.hasNext()) {
                Object next = it.next();
                i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AutoStyle autoStyle = (AutoStyle) next;
                iVarK = kVar.k(autoStyle);
                aVar = new a(autoStyle, l0Var2, kVar, i10);
                this.f160452e = l0Var2;
                this.f160448a = kVar;
                this.f160449b = it;
                this.f160450c = i11;
                this.f160451d = 2;
                if (iVarK.collect(aVar, this) == objL) {
                    return objL;
                }
                i10 = i11;
            }
            return Unit.f312394a;
            if (this.f160455h) {
                kVar = k.this;
                i10 = 0;
                l0Var2 = l0Var;
                it = listI.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AutoStyle autoStyle2 = (AutoStyle) next2;
                    iVarK = kVar.k(autoStyle2);
                    aVar = new a(autoStyle2, l0Var2, kVar, i10);
                    this.f160452e = l0Var2;
                    this.f160448a = kVar;
                    this.f160449b = it;
                    this.f160450c = i11;
                    this.f160451d = 2;
                    if (iVarK.collect(aVar, this) == objL) {
                        return objL;
                    }
                    i10 = i11;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super com.planner5d.library.dgenerator.fragment.list.r> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.LoadAutoStylesInteractor$refreshAutoStyle$1", f = "LoadAutoStylesInteractor.kt", i = {1, 2}, l = {41, 48, 49, 50}, m = "invokeSuspend", n = {"$this$channelFlow", "autoStyleId"}, s = {"L$0", "J$0"})
    @SourceDebugExtension({"SMAP\nLoadAutoStylesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadAutoStylesInteractor.kt\ncom/planner5d/library/dgenerator/interactor/LoadAutoStylesInteractor$refreshAutoStyle$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super AutoStyle>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f160460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f160461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f160462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f160464e;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoStyle f160465a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0<AutoStyle> f160466b;

            /* JADX WARN: Multi-variable type inference failed */
            a(AutoStyle autoStyle, l0<? super AutoStyle> l0Var) {
                this.f160465a = autoStyle;
                this.f160466b = l0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AutoStyle autoStyle, kotlin.coroutines.d<? super Unit> dVar) {
                timber.log.b.f381052a.a("AutoStyle " + this.f160465a.getId() + " newAutoStyle " + this.f160465a.t() + " progress " + this.f160465a.w(), new Object[0]);
                Object objG = this.f160466b.G(autoStyle, dVar);
                return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AutoStyle autoStyle, k kVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f160463d = autoStyle;
            this.f160464e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f160463d, this.f160464e, dVar);
            cVar.f160462c = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x013c  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x014b, code lost:
        
            if (r13.b(r3, r12) == r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.interactor.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super AutoStyle> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k(@NotNull com.planner5d.library.database.manager.a databaseManager, @NotNull nb.h startNewAutoStyleUseCase, @NotNull com.planner5d.library.dgenerator.data.a designProcessTracker) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(startNewAutoStyleUseCase, "startNewAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(designProcessTracker, "designProcessTracker");
        this.f160445a = databaseManager;
        this.f160446b = startNewAutoStyleUseCase;
        this.f160447c = designProcessTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AutoStyle> i() {
        List<AutoStyle> listF = this.f160445a.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((AutoStyle) obj).x() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(AutoStyle autoStyle) {
        Date dateU;
        return (autoStyle.s() || (dateU = autoStyle.u()) == null || new Date().getTime() - dateU.getTime() <= 300000) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.i<AutoStyle> k(AutoStyle autoStyle) {
        return kotlinx.coroutines.flow.k.x(new c(autoStyle, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(AutoStyle autoStyle, kotlin.coroutines.d<? super Long> dVar) {
        return this.f160445a.j(autoStyle, dVar);
    }

    @Override // nb.f
    @NotNull
    public kotlinx.coroutines.flow.i<com.planner5d.library.dgenerator.fragment.list.r> a(boolean z10, @Nullable Integer num) {
        return kotlinx.coroutines.flow.k.x(new b(num, z10, null));
    }
}
