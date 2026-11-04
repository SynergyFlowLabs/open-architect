package org.reduxkotlin;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compose.kt\norg/reduxkotlin/ComposeKt$compose$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,14:1\n13260#2,6:15\n*S KotlinDebug\n*F\n+ 1 Compose.kt\norg/reduxkotlin/ComposeKt$compose$1\n*L\n7#1:15,6\n*E\n"})
    static final class a<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, T>[] f339451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, ? extends T>[] function1Arr) {
            super(1);
            this.f339451a = function1Arr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            Function1<T, T>[] function1Arr = this.f339451a;
            for (int lastIndex = ArraysKt.getLastIndex(function1Arr); lastIndex >= 0; lastIndex--) {
                t10 = function1Arr[lastIndex].invoke(t10);
            }
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compose.kt\norg/reduxkotlin/ComposeKt$compose$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1819#2,8:15\n*S KotlinDebug\n*F\n+ 1 Compose.kt\norg/reduxkotlin/ComposeKt$compose$2\n*L\n13#1:15,8\n*E\n"})
    static final class b<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Function1<T, T>> f339452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Function1<? super T, ? extends T>> list) {
            super(1);
            this.f339452a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            List<Function1<T, T>> list = this.f339452a;
            if (!list.isEmpty()) {
                ListIterator<Function1<T, T>> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    t10 = listIterator.previous().invoke(t10);
                }
            }
            return t10;
        }
    }

    @NotNull
    public static final <T> Function1<T, T> a(@NotNull List<? extends Function1<? super T, ? extends T>> functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        return new b(functions);
    }

    @NotNull
    public static final <T> Function1<T, T> b(@NotNull Function1<? super T, ? extends T>... functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        return new a(functions);
    }
}
