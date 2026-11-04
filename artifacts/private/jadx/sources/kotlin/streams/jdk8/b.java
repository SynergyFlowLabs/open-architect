package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.collections.ArraysKt;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "StreamsKt")
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n31#2:23\n*E\n"})
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f313180a;

        public a(Stream stream) {
            this.f313180a = stream;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            Iterator<T> it = this.f313180a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n39#2:23\n*E\n"})
    public static final class C2264b implements Sequence<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f313181a;

        public C2264b(IntStream intStream) {
            this.f313181a = intStream;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f313181a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n47#2:23\n*E\n"})
    public static final class c implements Sequence<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f313182a;

        public c(LongStream longStream) {
            this.f313182a = longStream;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f313182a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n55#2:23\n*E\n"})
    public static final class d implements Sequence<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f313183a;

        public d(DoubleStream doubleStream) {
            this.f313183a = doubleStream;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f313183a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    @e1(version = "1.2")
    @NotNull
    public static final Sequence<Double> b(@NotNull DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @e1(version = "1.2")
    @NotNull
    public static final Sequence<Integer> c(@NotNull IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        return new C2264b(intStream);
    }

    @e1(version = "1.2")
    @NotNull
    public static final Sequence<Long> d(@NotNull LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        return new c(longStream);
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> Sequence<T> e(@NotNull Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        return new a(stream);
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> Stream<T> f(@NotNull final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return b.g(sequence);
            }
        }, 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream(...)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(Sequence sequence) {
        return Spliterators.spliteratorUnknownSize(sequence.iterator(), 16);
    }

    @e1(version = "1.2")
    @NotNull
    public static final List<Double> h(@NotNull DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }

    @e1(version = "1.2")
    @NotNull
    public static final List<Integer> i(@NotNull IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }

    @e1(version = "1.2")
    @NotNull
    public static final List<Long> j(@NotNull LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> List<T> k(@NotNull Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
        return (List) objCollect;
    }
}
