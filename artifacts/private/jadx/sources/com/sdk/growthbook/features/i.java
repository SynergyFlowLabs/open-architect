package com.sdk.growthbook.features;

import com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel;
import com.sdk.growthbook.utils.s;
import io.sentry.a8;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFeaturesDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturesDataSource.kt\ncom/sdk/growthbook/features/FeaturesDataSource\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,125:1\n35#2,6:126\n*S KotlinDebug\n*F\n+ 1 FeaturesDataSource.kt\ncom/sdk/growthbook/features/FeaturesDataSource\n*L\n64#1:126,6\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.sdk.growthbook.network.i f266242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.sdk.growthbook.model.d f266243b;

    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.features.FeaturesDataSource$autoRefresh$$inlined$transform$1", f = "FeaturesDataSource.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super s<? extends Map<String, ? extends com.sdk.growthbook.model.h>>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f266245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f266246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f266247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f266248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f266249f;

        /* JADX INFO: renamed from: com.sdk.growthbook.features.i$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 FeaturesDataSource.kt\ncom/sdk/growthbook/features/FeaturesDataSource\n*L\n1#1,38:1\n65#2,14:39\n*E\n"})
        public static final class C1847a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<s<? extends Map<String, ? extends com.sdk.growthbook.model.h>>> f266250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f266251b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f266252c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1 f266253d;

            /* JADX INFO: renamed from: com.sdk.growthbook.features.i$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.features.FeaturesDataSource$autoRefresh$$inlined$transform$1$1", f = "FeaturesDataSource.kt", i = {0, 1}, l = {46, 49}, m = "emit", n = {"featuresDataModel", "resource"}, s = {"L$0", "L$0"})
            public static final class C1848a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f266254a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f266255b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f266257d;

                public C1848a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f266254a = obj;
                    this.f266255b |= Integer.MIN_VALUE;
                    return C1847a.this.emit(null, this);
                }
            }

            public C1847a(kotlinx.coroutines.flow.j jVar, i iVar, Function1 function1, Function1 function2) {
                this.f266251b = iVar;
                this.f266252c = function1;
                this.f266253d = function2;
                this.f266250a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
            
                if (r8.emit(r7, r0) == r1) goto L27;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    java.lang.String r5 = "Androeed.ru"
                    boolean r0 = r8 instanceof com.sdk.growthbook.features.i.a.C1847a.C1848a
                    if (r0 == 0) goto L17
                    r0 = r8
                    r5 = 6
                    com.sdk.growthbook.features.i$a$a$a r0 = (com.sdk.growthbook.features.i.a.C1847a.C1848a) r0
                    r5 = 6
                    int r1 = r0.f266255b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    int r1 = r1 - r2
                    r0.f266255b = r1
                    goto L1c
                L17:
                    com.sdk.growthbook.features.i$a$a$a r0 = new com.sdk.growthbook.features.i$a$a$a
                    r0.<init>(r8)
                L1c:
                    r5 = 5
                    java.lang.Object r8 = r0.f266254a
                    r5 = 5
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 0
                    int r2 = r0.f266255b
                    r3 = 2
                    int r5 = r5 << r3
                    r4 = 6
                    r4 = 1
                    if (r2 == 0) goto L4d
                    r5 = 2
                    if (r2 == r4) goto L44
                    if (r2 != r3) goto L3a
                    java.lang.Object r7 = r0.f266257d
                    com.sdk.growthbook.utils.s r7 = (com.sdk.growthbook.utils.s) r7
                    kotlin.ResultKt.m(r8)
                    goto Lad
                L3a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "etsvec/otmsneb//u iolw e  /alno/ //ceoi ri/kurotfer"
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L44:
                    r5 = 1
                    java.lang.Object r7 = r0.f266257d
                    com.sdk.growthbook.features.b r7 = (com.sdk.growthbook.features.b) r7
                    kotlin.ResultKt.m(r8)
                    goto L95
                L4d:
                    kotlin.ResultKt.m(r8)
                    r5 = 6
                    kotlinx.coroutines.flow.j<com.sdk.growthbook.utils.s<? extends java.util.Map<java.lang.String, ? extends com.sdk.growthbook.model.h>>> r8 = r6.f266250a
                    com.sdk.growthbook.utils.s r7 = (com.sdk.growthbook.utils.s) r7
                    boolean r2 = r7 instanceof com.sdk.growthbook.utils.s.b
                    if (r2 == 0) goto L9d
                    com.sdk.growthbook.features.i r2 = r6.f266251b
                    kotlinx.serialization.json.Json r2 = com.sdk.growthbook.features.i.g(r2)
                    com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel$Companion r3 = com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel.Companion
                    kotlinx.serialization.KSerializer r3 = r3.serializer()
                    kotlinx.serialization.e r3 = (kotlinx.serialization.e) r3
                    r5 = 7
                    com.sdk.growthbook.utils.s$b r7 = (com.sdk.growthbook.utils.s.b) r7
                    r5 = 0
                    java.lang.Object r7 = r7.d()
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object r7 = r2.decodeFromString(r3, r7)
                    r5 = 1
                    com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel r7 = (com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel) r7
                    com.sdk.growthbook.features.b r7 = qf.b.a(r7)
                    r5 = 5
                    java.util.Map r2 = r7.i()
                    r5 = 0
                    com.sdk.growthbook.utils.s$b r3 = new com.sdk.growthbook.utils.s$b
                    r5 = 2
                    r3.<init>(r2)
                    r0.f266257d = r7
                    r0.f266255b = r4
                    java.lang.Object r8 = r8.emit(r3, r0)
                    r5 = 4
                    if (r8 != r1) goto L95
                    r5 = 7
                    goto Lac
                L95:
                    kotlin.jvm.functions.Function1 r6 = r6.f266252c
                    r5 = 1
                    r6.invoke(r7)
                    r5 = 5
                    goto Lb8
                L9d:
                    boolean r2 = r7 instanceof com.sdk.growthbook.utils.s.a
                    if (r2 == 0) goto Lb8
                    r0.f266257d = r7
                    r0.f266255b = r3
                    java.lang.Object r8 = r8.emit(r7, r0)
                    r5 = 0
                    if (r8 != r1) goto Lad
                Lac:
                    return r1
                Lad:
                    com.sdk.growthbook.utils.s$a r7 = (com.sdk.growthbook.utils.s.a) r7
                    java.lang.Exception r7 = r7.d()
                    kotlin.jvm.functions.Function1 r6 = r6.f266253d
                    r6.invoke(r7)
                Lb8:
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sdk.growthbook.features.i.a.C1847a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.d dVar, i iVar2, Function1 function1, Function1 function2) {
            super(2, dVar);
            this.f266246c = iVar;
            this.f266247d = iVar2;
            this.f266248e = function1;
            this.f266249f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f266246c, dVar, this.f266247d, this.f266248e, this.f266249f);
            aVar.f266245b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266244a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f266245b;
                kotlinx.coroutines.flow.i iVar = this.f266246c;
                C1847a c1847a = new C1847a(jVar, this.f266247d, this.f266248e, this.f266249f);
                this.f266244a = 1;
                if (iVar.collect(c1847a, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super s<? extends Map<String, ? extends com.sdk.growthbook.model.h>>> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i(@NotNull com.sdk.growthbook.network.i dispatcher, @NotNull com.sdk.growthbook.model.d gbContext) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(gbContext, "gbContext");
        this.f266242a = dispatcher;
        this.f266243b = gbContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setPrettyPrint(true);
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(i iVar, Function1 function1, String rawContent) {
        Intrinsics.checkNotNullParameter(rawContent, "rawContent");
        function1.invoke(qf.b.a((SerializableFeaturesDataModel) iVar.q().decodeFromString(SerializableFeaturesDataModel.Companion.serializer(), rawContent)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, Throwable apiTimeError) {
        Intrinsics.checkNotNullParameter(apiTimeError, "apiTimeError");
        function1.invoke(apiTimeError);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(i iVar, Function1 function1, String rawContent) {
        Intrinsics.checkNotNullParameter(rawContent, "rawContent");
        function1.invoke(new s.b(qf.b.a((SerializableFeaturesDataModel) iVar.q().decodeFromString(SerializableFeaturesDataModel.Companion.serializer(), rawContent))));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        function1.invoke(new s.a(new Exception(error.getMessage())));
        return Unit.f312394a;
    }

    private final String o(com.sdk.growthbook.utils.i iVar) {
        return new com.sdk.growthbook.features.a().a(this.f266243b.y(), this.f266243b.r(), iVar);
    }

    static /* synthetic */ String p(i iVar, com.sdk.growthbook.utils.i iVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar2 = com.sdk.growthbook.utils.i.STALE_WHILE_REVALIDATE;
        }
        return iVar.o(iVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Json q() {
        return JsonKt.Json$default(null, new Function1() { // from class: com.sdk.growthbook.features.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.f((JsonBuilder) obj);
            }
        }, 1, null);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<s<Map<String, com.sdk.growthbook.model.h>>> h(@NotNull Function1<? super b, Unit> success, @NotNull Function1<? super Throwable, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        return kotlinx.coroutines.flow.k.K0(new a(this.f266242a.c(o(com.sdk.growthbook.utils.i.SERVER_SENT_EVENTS)), null, this, success, failure));
    }

    public final void i(@NotNull final Function1<? super b, Unit> success, @NotNull final Function1<? super Throwable, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f266242a.b(p(this, null, 1, null), new Function1() { // from class: com.sdk.growthbook.features.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.j(this.f266236a, success, (String) obj);
            }
        }, new Function1() { // from class: com.sdk.growthbook.features.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.k(failure, (Throwable) obj);
            }
        });
    }

    public final void l(@Nullable com.sdk.growthbook.utils.k kVar, @NotNull final Function1<? super s.b<b>, Unit> success, @NotNull final Function1<? super s.a, Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (kVar != null) {
            linkedHashMap.put(a8.b.f303905f, kVar.f());
            linkedHashMap.put("forcedFeatures", kVar.g());
            linkedHashMap.put("forcedVariations", kVar.h());
        }
        if (this.f266243b.t()) {
            System.out.println(linkedHashMap);
        }
        this.f266242a.a(o(com.sdk.growthbook.utils.i.SERVER_SENT_REMOTE_FEATURE_EVAL), linkedHashMap, new Function1() { // from class: com.sdk.growthbook.features.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.m(this.f266239a, success, (String) obj);
            }
        }, new Function1() { // from class: com.sdk.growthbook.features.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.n(failure, (Throwable) obj);
            }
        });
    }
}
