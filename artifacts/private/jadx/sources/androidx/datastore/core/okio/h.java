package androidx.datastore.core.okio;

import androidx.datastore.core.w0;
import java.io.Closeable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import okio.l0;
import okio.m;
import okio.r0;
import okio.t;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:232\n66#2:237\n52#2,21:238\n60#2,10:259\n57#2,2:269\n71#2,2:271\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n214#1:231\n214#1:232,5\n215#1:237\n215#1:238,21\n214#1:259,10\n214#1:269,2\n214#1:271,2\n*E\n"})
public final class h<T> extends c<T> implements w0<T> {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {216}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h<T> f49761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49762f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<T> hVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49761e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49760d = obj;
            this.f49762f |= Integer.MIN_VALUE;
            return this.f49761e.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull v fileSystem, @NotNull r0 path, @NotNull d<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.datastore.core.w0
    @Nullable
    public Object a(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        Closeable closeable;
        Closeable closeable2;
        Closeable closeable3;
        Unit unit;
        Throwable th2;
        Unit unit2;
        t tVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49762f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49762f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f49760d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f49762f;
        boolean z10 = true | true;
        Throwable th3 = null;
        if (i11 == 0) {
            ResultKt.m(obj);
            f();
            t tVarG = g().G(h());
            try {
                m mVarD = l0.d(t.X(tVarG, 0L, 1, null));
                try {
                    d<T> dVarI = i();
                    aVar.f49757a = tVarG;
                    aVar.f49758b = tVarG;
                    aVar.f49759c = mVarD;
                    aVar.f49762f = 1;
                    if (dVarI.a(t10, mVarD, aVar) == objL) {
                        return objL;
                    }
                    t tVar2 = tVarG;
                    closeable = tVar2;
                    closeable2 = mVarD;
                    tVar = tVar2;
                } catch (Throwable th4) {
                    th = th4;
                    closeable = tVarG;
                    closeable2 = mVarD;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    th2 = th;
                    unit2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                closeable3 = tVarG;
                if (closeable3 != null) {
                    closeable3.close();
                }
                th3 = th;
                unit = null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) aVar.f49759c;
            t tVar3 = (t) aVar.f49758b;
            closeable = (Closeable) aVar.f49757a;
            try {
                ResultKt.m(obj);
                closeable = closeable;
                tVar = tVar3;
            } catch (Throwable th6) {
                th = th6;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th7) {
                        try {
                            p.a(th, th7);
                        } catch (Throwable th8) {
                            th = th8;
                            closeable3 = closeable;
                            if (closeable3 != null) {
                                try {
                                    closeable3.close();
                                } catch (Throwable th9) {
                                    p.a(th, th9);
                                }
                            }
                            th3 = th;
                            unit = null;
                        }
                    }
                }
                th2 = th;
                unit2 = null;
            }
        }
        tVar.flush();
        unit2 = Unit.f312394a;
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        Closeable closeable4 = closeable;
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(unit2);
        unit = Unit.f312394a;
        if (closeable4 != null) {
            try {
                closeable4.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        if (th3 != null) {
            throw th3;
        }
        Intrinsics.checkNotNull(unit);
        return Unit.f312394a;
    }
}
