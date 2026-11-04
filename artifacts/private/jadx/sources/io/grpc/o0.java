package io.grpc;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public abstract class o0 {
    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public List<t2> a() {
        return Collections.EMPTY_LIST;
    }

    @fj.h
    public final q2<?, ?> b(String str) {
        return c(str, null);
    }

    @fj.h
    public abstract q2<?, ?> c(String str, @fj.h String str2);
}
