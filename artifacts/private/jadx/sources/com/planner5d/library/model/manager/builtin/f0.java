package com.planner5d.library.model.manager.builtin;

import java.util.concurrent.Future;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Future) obj).isDone();
    }
}
