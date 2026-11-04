package com.planner5d.library.services.utility;

import java.lang.Throwable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface s2<T, E extends Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f229744a = a.f229745a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f229745a = new a();

        private a() {
        }

        public final <T, E extends Throwable> T a(@NotNull s2<T, E> s2Var, @NotNull Function1<? super E, ? extends T> onFailure) {
            Intrinsics.checkNotNullParameter(s2Var, "<this>");
            Intrinsics.checkNotNullParameter(onFailure, "onFailure");
            if (s2Var instanceof c) {
                return (T) ((c) s2Var).e();
            }
            if (s2Var instanceof b) {
                return onFailure.invoke(((b) s2Var).e());
            }
            throw new kotlin.k0();
        }

        public final /* synthetic */ <T, E extends Throwable> s2<T, E> b(Function0<? extends T> block) throws Throwable {
            Intrinsics.checkNotNullParameter(block, "block");
            try {
                return new c(block.invoke());
            } catch (Throwable th2) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.T4);
                return new b(th2);
            }
        }
    }

    public static final class b<T, E extends Throwable> implements s2<T, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final E f229746b;

        public b(@NotNull E exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f229746b = exception;
        }

        @Override // com.planner5d.library.services.utility.s2
        @Nullable
        public c<T, E> a() {
            return null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
        @Override // com.planner5d.library.services.utility.s2
        public T c() throws Throwable {
            throw this.f229746b;
        }

        @Override // com.planner5d.library.services.utility.s2
        @NotNull
        public E d() {
            return this.f229746b;
        }

        @NotNull
        public final E e() {
            return this.f229746b;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
        @Override // com.planner5d.library.services.utility.s2
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void b() throws Throwable {
            throw this.f229746b;
        }
    }

    public static final class c<T, E extends Throwable> implements s2<T, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f229747b;

        public c(T t10) {
            this.f229747b = t10;
        }

        @Override // com.planner5d.library.services.utility.s2
        @NotNull
        public c<T, E> a() {
            return this;
        }

        @Override // com.planner5d.library.services.utility.s2
        public void b() {
        }

        @Override // com.planner5d.library.services.utility.s2
        public T c() {
            return this.f229747b;
        }

        @Override // com.planner5d.library.services.utility.s2
        @Nullable
        public E d() {
            return null;
        }

        public final T e() {
            return this.f229747b;
        }
    }

    @Nullable
    c<T, E> a();

    void b() throws Throwable;

    T c() throws Throwable;

    @Nullable
    E d();
}
