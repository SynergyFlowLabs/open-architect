package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,65:1\n49#2:66\n51#2:70\n46#3:67\n51#3:69\n105#4:68\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n*L\n35#1:66\n35#1:70\n35#1:67\n35#1:69\n35#1:68\n*E\n"})
public final class z2 implements androidx.compose.foundation.interaction.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29262d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<androidx.compose.foundation.interaction.l.b, androidx.compose.foundation.interaction.l.b> f29264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> f29265c;

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f29266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z2 f29267b;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.z2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n*L\n1#1,218:1\n50#2:219\n36#3,24:220\n*E\n"})
        public static final class C0234a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f29268a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z2 f29269b;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.z2$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            public static final class C0235a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f29270a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f29271b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f29272c;

                public C0235a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f29270a = obj;
                    this.f29271b |= Integer.MIN_VALUE;
                    return C0234a.this.emit(null, this);
                }
            }

            public C0234a(kotlinx.coroutines.flow.j jVar, z2 z2Var) {
                this.f29268a = jVar;
                this.f29269b = z2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0235a c0235a;
                androidx.compose.foundation.interaction.l.c cVar;
                androidx.compose.foundation.interaction.l.a aVar;
                Object cVar2;
                if (dVar instanceof C0235a) {
                    c0235a = (C0235a) dVar;
                    int i10 = c0235a.f29271b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0235a.f29271b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0235a = new C0235a(dVar);
                    }
                } else {
                    c0235a = new C0235a(dVar);
                }
                Object obj2 = c0235a.f29270a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0235a.f29271b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f29268a;
                    androidx.compose.foundation.interaction.g gVar = (androidx.compose.foundation.interaction.g) obj;
                    if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                        androidx.compose.foundation.interaction.l.b bVarF = this.f29269b.f((androidx.compose.foundation.interaction.l.b) gVar);
                        this.f29269b.f29264b.put(gVar, bVarF);
                        cVar2 = bVarF;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                        aVar = (androidx.compose.foundation.interaction.l.a) gVar;
                        androidx.compose.foundation.interaction.l.b bVar = (androidx.compose.foundation.interaction.l.b) this.f29269b.f29264b.remove(aVar.a());
                        if (bVar != null) {
                            cVar2 = aVar;
                            cVar2 = new androidx.compose.foundation.interaction.l.a(bVar);
                        }
                    } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                        cVar = (androidx.compose.foundation.interaction.l.c) gVar;
                        androidx.compose.foundation.interaction.l.b bVar2 = (androidx.compose.foundation.interaction.l.b) this.f29269b.f29264b.remove(cVar.a());
                        if (bVar2 != null) {
                            cVar2 = gVar;
                            cVar2 = cVar;
                            cVar2 = new androidx.compose.foundation.interaction.l.c(bVar2);
                        }
                    }
                    cVar2 = gVar;
                    cVar2 = cVar;
                    cVar2 = gVar;
                    cVar2 = aVar;
                    c0235a.f29271b = 1;
                    if (jVar.emit(cVar2, c0235a) == objL) {
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

        public a(kotlinx.coroutines.flow.i iVar, z2 z2Var) {
            this.f29266a = iVar;
            this.f29267b = z2Var;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super androidx.compose.foundation.interaction.g> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f29266a.collect(new C0234a(jVar, this.f29267b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    public /* synthetic */ z2(androidx.compose.foundation.interaction.h hVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.interaction.l.b f(androidx.compose.foundation.interaction.l.b bVar) {
        return new androidx.compose.foundation.interaction.l.b(n0.g.v(bVar.a(), this.f29263a), null);
    }

    @Override // androidx.compose.foundation.interaction.h
    @NotNull
    public kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> c() {
        return this.f29265c;
    }

    private z2(androidx.compose.foundation.interaction.h hVar, long j10) {
        this.f29263a = j10;
        this.f29264b = new LinkedHashMap();
        this.f29265c = new a(hVar.c(), this);
    }
}
