package com.planner5d.library.services.jsoniterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nJsonArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonArrayIterator.kt\ncom/planner5d/library/services/jsoniterator/JsonArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public abstract class a<T> implements Iterator<T>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONArray f224354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f224355b;

    public a(@NotNull JSONArray array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f224354a = array;
    }

    @NotNull
    protected final JSONArray b() {
        return this.f224354a;
    }

    @Nullable
    protected abstract T c(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224354a.length() > this.f224355b;
    }

    @Override // java.util.Iterator
    public T next() throws NoSuchElementException {
        T tC = c(this.f224355b);
        this.f224355b++;
        if (tC != null) {
            return tC;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
