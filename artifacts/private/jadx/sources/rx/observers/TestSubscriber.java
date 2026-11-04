package rx.observers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ni.f;
import rx.Notification;
import rx.Observer;
import rx.Subscriber;
import rx.annotations.Experimental;
import rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes14.dex */
public class TestSubscriber<T> extends Subscriber<T> {
    private static final Observer<Object> INERT = new Observer<Object>() { // from class: rx.observers.TestSubscriber.1
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    };
    private int completions;
    private final Observer<T> delegate;
    private final List<Throwable> errors;
    private volatile Thread lastSeenThread;
    private final CountDownLatch latch;
    private volatile int valueCount;
    private final List<T> values;

    public TestSubscriber(long j10) {
        this(INERT, j10);
    }

    private void assertItem(T t10, int i10) {
        T t11 = this.values.get(i10);
        if (t10 == null) {
            if (t11 != null) {
                assertionError("Value at index: " + i10 + " expected to be [null] but was: [" + t11 + "]\n");
            }
        } else if (!t10.equals(t11)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Value at index: ");
            sb2.append(i10);
            sb2.append(" expected to be [");
            sb2.append(t10);
            sb2.append("] (");
            sb2.append(t10.getClass().getSimpleName());
            sb2.append(") but was: [");
            sb2.append(t11);
            sb2.append("] (");
            sb2.append(t11 != null ? t11.getClass().getSimpleName() : AbstractJsonLexerKt.NULL);
            sb2.append(")\n");
            assertionError(sb2.toString());
        }
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public void assertCompleted() {
        int i10 = this.completions;
        if (i10 == 0) {
            assertionError("Not completed!");
        } else if (i10 > 1) {
            assertionError("Completed multiple times: " + i10);
        }
    }

    public void assertError(Class<? extends Throwable> cls) {
        List<Throwable> list = this.errors;
        if (list.isEmpty()) {
            assertionError("No errors");
            return;
        }
        if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        }
        int i10 = 5 & 0;
        if (cls.isInstance(list.get(0))) {
            return;
        }
        AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
        assertionError2.initCause(list.get(0));
        throw assertionError2;
    }

    public void assertNoErrors() {
        if (!getOnErrorEvents().isEmpty()) {
            assertionError("Unexpected onError events");
        }
    }

    public void assertNoTerminalEvent() {
        List<Throwable> list = this.errors;
        int i10 = this.completions;
        if (!list.isEmpty() || i10 > 0) {
            if (list.isEmpty()) {
                assertionError("Found " + list.size() + " errors and " + i10 + " completion events instead of none");
                return;
            }
            if (list.size() == 1) {
                assertionError("Found " + list.size() + " errors and " + i10 + " completion events instead of none");
                return;
            }
            assertionError("Found " + list.size() + " errors and " + i10 + " completion events instead of none");
        }
    }

    public void assertNoValues() {
        int size = this.values.size();
        if (size != 0) {
            assertionError("No onNext events expected yet some received: " + size);
        }
    }

    public void assertNotCompleted() {
        int i10 = this.completions;
        if (i10 == 1) {
            assertionError("Completed!");
        } else if (i10 > 1) {
            assertionError("Completed multiple times: " + i10);
        }
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.values.size() != list.size()) {
            assertionError("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.values.size() + ".\nProvided values: " + list + "\nActual values: " + this.values + "\n");
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            assertItem(list.get(i10), i10);
        }
    }

    public void assertTerminalEvent() {
        if (this.errors.size() > 1) {
            assertionError("Too many onError events: " + this.errors.size());
        }
        if (this.completions > 1) {
            assertionError("Too many onCompleted events: " + this.completions);
        }
        if (this.completions == 1 && this.errors.size() == 1) {
            assertionError("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.completions == 0 && this.errors.isEmpty()) {
            assertionError("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (!isUnsubscribed()) {
            assertionError("Not unsubscribed.");
        }
    }

    public void assertValue(T t10) {
        assertReceivedOnNext(Collections.singletonList(t10));
    }

    public void assertValueCount(int i10) {
        int size = this.values.size();
        if (size != i10) {
            assertionError("Number of onNext events differ; expected: " + i10 + ", actual: " + size);
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(Arrays.asList(tArr));
    }

    @Experimental
    public final void assertValuesAndClear(T t10, T... tArr) {
        assertValueCount(tArr.length + 1);
        int i10 = 0;
        assertItem(t10, 0);
        while (i10 < tArr.length) {
            T t11 = tArr[i10];
            i10++;
            assertItem(t11, i10);
        }
        this.values.clear();
    }

    final void assertionError(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append(" (");
        int i10 = this.completions;
        sb2.append(i10);
        sb2.append(" completion");
        if (i10 != 1) {
            sb2.append(f.f333366c);
        }
        sb2.append(')');
        if (!this.errors.isEmpty()) {
            int size = this.errors.size();
            sb2.append(" (+");
            sb2.append(size);
            sb2.append(" error");
            if (size != 1) {
                sb2.append(f.f333366c);
            }
            sb2.append(')');
        }
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (this.errors.isEmpty()) {
            throw assertionError;
        }
        if (this.errors.size() == 1) {
            assertionError.initCause(this.errors.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.errors));
        throw assertionError;
    }

    public void awaitTerminalEvent() {
        try {
            this.latch.await();
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Interrupted", e10);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j10, TimeUnit timeUnit) {
        try {
            if (this.latch.await(j10, timeUnit)) {
                return;
            }
            unsubscribe();
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    @Experimental
    public final boolean awaitValueCount(int i10, long j10, TimeUnit timeUnit) {
        while (j10 != 0 && this.valueCount < i10) {
            try {
                timeUnit.sleep(1L);
                j10--;
            } catch (InterruptedException e10) {
                throw new IllegalStateException("Interrupted", e10);
            }
        }
        return this.valueCount >= i10;
    }

    @Experimental
    public final int getCompletions() {
        return this.completions;
    }

    public Thread getLastSeenThread() {
        return this.lastSeenThread;
    }

    @Deprecated
    public List<Notification<T>> getOnCompletedEvents() {
        int i10 = this.completions;
        ArrayList arrayList = new ArrayList(i10 != 0 ? i10 : 1);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(Notification.createOnCompleted());
        }
        return arrayList;
    }

    public List<Throwable> getOnErrorEvents() {
        return this.errors;
    }

    public List<T> getOnNextEvents() {
        return this.values;
    }

    public final int getValueCount() {
        return this.valueCount;
    }

    @Override // rx.Observer
    public void onCompleted() {
        try {
            this.completions++;
            this.lastSeenThread = Thread.currentThread();
            this.delegate.onCompleted();
        } finally {
            this.latch.countDown();
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        try {
            this.lastSeenThread = Thread.currentThread();
            this.errors.add(th2);
            this.delegate.onError(th2);
            this.latch.countDown();
        } catch (Throwable th3) {
            this.latch.countDown();
            throw th3;
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.lastSeenThread = Thread.currentThread();
        this.values.add(t10);
        this.valueCount = this.values.size();
        this.delegate.onNext(t10);
    }

    public void requestMore(long j10) {
        request(j10);
    }

    public TestSubscriber(Observer<T> observer, long j10) {
        this.latch = new CountDownLatch(1);
        observer.getClass();
        this.delegate = observer;
        if (j10 >= 0) {
            request(j10);
        }
        this.values = new ArrayList();
        this.errors = new ArrayList();
    }

    public static <T> TestSubscriber<T> create(long j10) {
        return new TestSubscriber<>(j10);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer, long j10) {
        return new TestSubscriber<>(observer, j10);
    }

    public void awaitTerminalEvent(long j10, TimeUnit timeUnit) {
        try {
            this.latch.await(j10, timeUnit);
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Interrupted", e10);
        }
    }

    public static <T> TestSubscriber<T> create(Subscriber<T> subscriber) {
        return new TestSubscriber<>((Subscriber) subscriber);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer) {
        return new TestSubscriber<>(observer);
    }

    public TestSubscriber(Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public void assertError(Throwable th2) {
        List<Throwable> list = this.errors;
        if (list.isEmpty()) {
            assertionError("No errors");
            return;
        }
        if (list.size() > 1) {
            assertionError("Multiple errors");
            return;
        }
        if (th2.equals(list.get(0))) {
            return;
        }
        assertionError("Exceptions differ; expected: " + th2 + ", actual: " + list.get(0));
    }
}
