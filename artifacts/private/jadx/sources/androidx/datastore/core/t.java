package androidx.datastore.core;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class t<T> extends q<T> implements w0<T> {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", i = {0}, l = {201}, m = "writeData", n = {"stream"}, s = {"L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t<T> f49807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49808e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<T> tVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49807d = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49806c = obj;
            this.f49808e |= Integer.MIN_VALUE;
            return this.f49807d.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull File file, @NotNull l0<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.datastore.core.w0
    @Nullable
    public Object a(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49808e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49808e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f49806c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f49808e;
        if (i11 == 0) {
            ResultKt.m(obj);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                l0<T> l0VarH = h();
                u0 u0Var = new u0(fileOutputStream2);
                aVar.f49804a = fileOutputStream2;
                aVar.f49805b = fileOutputStream2;
                aVar.f49808e = 1;
                if (l0VarH.L(t10, u0Var, aVar) == objL) {
                    return objL;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f49805b;
            closeable = (Closeable) aVar.f49804a;
            try {
                ResultKt.m(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    kotlin.io.c.a(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.f312394a;
        kotlin.io.c.a(closeable, null);
        return unit;
    }
}
