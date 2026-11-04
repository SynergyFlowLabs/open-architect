package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.w0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class n {

    /* JADX INFO: Add missing generic type declarations: [In] */
    class a<In> implements d1<In> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Out f77254a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.b f77255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f77256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n.a f77257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1 f77258e;

        /* JADX INFO: renamed from: androidx.work.impl.utils.n$a$a, reason: collision with other inner class name */
        class RunnableC0790a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f77259a;

            RunnableC0790a(final Object val$input) {
                this.f77259a = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f77256c) {
                    try {
                        ?? Apply = a.this.f77257d.apply(this.f77259a);
                        a aVar = a.this;
                        Out out = aVar.f77254a;
                        if (out == 0 && Apply != 0) {
                            aVar.f77254a = Apply;
                            aVar.f77258e.o(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            a aVar2 = a.this;
                            aVar2.f77254a = Apply;
                            aVar2.f77258e.o(Apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        a(final androidx.work.impl.utils.taskexecutor.b val$workTaskExecutor, final Object val$lock, final n.a val$mappingMethod, final a1 val$outputLiveData) {
            this.f77255b = val$workTaskExecutor;
            this.f77256c = val$lock;
            this.f77257d = val$mappingMethod;
            this.f77258e = val$outputLiveData;
        }

        @Override // androidx.lifecycle.d1
        public void c(@p0 final In input) {
            this.f77255b.b(new RunnableC0790a(input));
        }
    }

    private n() {
    }

    @NonNull
    @e.a({"LambdaLast"})
    public static <In, Out> w0<Out> a(@NonNull w0<In> inputLiveData, @NonNull final n.a<In, Out> mappingMethod, @NonNull final androidx.work.impl.utils.taskexecutor.b workTaskExecutor) {
        Object obj = new Object();
        a1 a1Var = new a1();
        a1Var.s(inputLiveData, new a(workTaskExecutor, obj, mappingMethod, a1Var));
        return a1Var;
    }
}
