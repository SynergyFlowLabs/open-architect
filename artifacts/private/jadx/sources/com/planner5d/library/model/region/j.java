package com.planner5d.library.model.region;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.e0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class j implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222792b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f222793a;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.region.UserProfileRegionProvider$awaitCountry$2", f = "UserProfileRegionProvider.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUserProfileRegionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProfileRegionProvider.kt\ncom/planner5d/library/model/region/UserProfileRegionProvider$awaitCountry$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,27:1\n49#2:28\n51#2:32\n46#3:29\n51#3:31\n105#4:30\n*S KotlinDebug\n*F\n+ 1 UserProfileRegionProvider.kt\ncom/planner5d/library/model/region/UserProfileRegionProvider$awaitCountry$2\n*L\n23#1:28\n23#1:32\n23#1:29\n23#1:31\n23#1:30\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222794a;

        /* JADX INFO: renamed from: com.planner5d.library.model.region.j$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
        public static final class C1640a implements kotlinx.coroutines.flow.i<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f222796a;

            /* JADX INFO: renamed from: com.planner5d.library.model.region.j$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UserProfileRegionProvider.kt\ncom/planner5d/library/model/region/UserProfileRegionProvider$awaitCountry$2\n*L\n1#1,49:1\n50#2:50\n23#3:51\n*E\n"})
            public static final class C1641a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f222797a;

                /* JADX INFO: renamed from: com.planner5d.library.model.region.j$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.region.UserProfileRegionProvider$awaitCountry$2$invokeSuspend$$inlined$map$1$2", f = "UserProfileRegionProvider.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class C1642a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f222798a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f222799b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f222800c;

                    public C1642a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f222798a = obj;
                        this.f222799b |= Integer.MIN_VALUE;
                        return C1641a.this.emit(null, this);
                    }
                }

                public C1641a(kotlinx.coroutines.flow.j jVar) {
                    this.f222797a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C1642a c1642a;
                    if (dVar instanceof C1642a) {
                        c1642a = (C1642a) dVar;
                        int i10 = c1642a.f222799b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c1642a.f222799b = i10 - Integer.MIN_VALUE;
                        } else {
                            c1642a = new C1642a(dVar);
                        }
                    } else {
                        c1642a = new C1642a(dVar);
                    }
                    Object obj2 = c1642a.f222798a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c1642a.f222799b;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        kotlinx.coroutines.flow.j jVar = this.f222797a;
                        id.a aVar = (id.a) obj;
                        String str = aVar != null ? aVar.f287085k : null;
                        c1642a.f222799b = 1;
                        if (jVar.emit(str, c1642a) == objL) {
                            return objL;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            public C1640a(kotlinx.coroutines.flow.i iVar) {
                this.f222796a = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super String> jVar, kotlin.coroutines.d dVar) {
                Object objCollect = this.f222796a.collect(new C1641a(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222794a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarV0 = kotlinx.coroutines.flow.k.v0(new C1640a(((t) j.this.f222793a.get()).d()));
                this.f222794a = 1;
                obj = kotlinx.coroutines.flow.k.y0(iVarV0, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public j(@NotNull fg.e<t> userAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f222793a = userAuthorization;
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        String str;
        id.a aVarA = this.f222793a.get().a();
        if (aVarA == null || (str = aVarA.f287085k) == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super String> dVar) {
        return b4.e(TimeUnit.SECONDS.toMillis(5L), new a(null), dVar);
    }
}
