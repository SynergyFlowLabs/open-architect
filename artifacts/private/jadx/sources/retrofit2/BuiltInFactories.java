package retrofit2;

import fj.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
class BuiltInFactories {

    @e.b(24)
    static final class Java8 extends BuiltInFactories {
        Java8() {
        }

        @Override // retrofit2.BuiltInFactories
        List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(@h Executor executor) {
            return Arrays.asList(new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(executor));
        }

        @Override // retrofit2.BuiltInFactories
        List<? extends Converter.Factory> createDefaultConverterFactories() {
            return Collections.singletonList(new OptionalConverterFactory());
        }
    }

    BuiltInFactories() {
    }

    List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(@h Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    List<? extends Converter.Factory> createDefaultConverterFactories() {
        return Collections.EMPTY_LIST;
    }
}
