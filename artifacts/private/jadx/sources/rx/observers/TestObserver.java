package rx.observers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ni.f;
import rx.Notification;
import rx.Observer;
import rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class TestObserver<T> implements Observer<T> {
    private static final Observer<Object> INERT = new Observer<Object>() { // from class: rx.observers.TestObserver.1
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
    private final Observer<T> delegate;
    private final List<Notification<T>> onCompletedEvents;
    private final List<Throwable> onErrorEvents;
    private final List<T> onNextEvents;

    public TestObserver(Observer<T> observer) {
        this.onNextEvents = new ArrayList();
        this.onErrorEvents = new ArrayList();
        this.onCompletedEvents = new ArrayList();
        this.delegate = observer;
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.onNextEvents.size() != list.size()) {
            assertionError("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.onNextEvents.size() + ".\nProvided values: " + list + "\nActual values: " + this.onNextEvents + "\n");
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            T t10 = list.get(i10);
            T t11 = this.onNextEvents.get(i10);
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
    }

    public void assertTerminalEvent() {
        if (this.onErrorEvents.size() > 1) {
            assertionError("Too many onError events: " + this.onErrorEvents.size());
        }
        if (this.onCompletedEvents.size() > 1) {
            assertionError("Too many onCompleted events: " + this.onCompletedEvents.size());
        }
        if (this.onCompletedEvents.size() == 1 && this.onErrorEvents.size() == 1) {
            assertionError("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.onCompletedEvents.isEmpty() && this.onErrorEvents.isEmpty()) {
            assertionError("No terminal events received.");
        }
    }

    final void assertionError(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append(" (");
        int size = this.onCompletedEvents.size();
        sb2.append(size);
        sb2.append(" completion");
        if (size != 1) {
            sb2.append(f.f333366c);
        }
        sb2.append(')');
        if (!this.onErrorEvents.isEmpty()) {
            int size2 = this.onErrorEvents.size();
            sb2.append(" (+");
            sb2.append(size2);
            sb2.append(" error");
            if (size2 != 1) {
                sb2.append(f.f333366c);
            }
            sb2.append(')');
        }
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.onErrorEvents.isEmpty()) {
            if (this.onErrorEvents.size() == 1) {
                assertionError.initCause(this.onErrorEvents.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.onErrorEvents));
            }
        }
        throw assertionError;
    }

    public List<Object> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.onNextEvents);
        arrayList.add(this.onErrorEvents);
        arrayList.add(this.onCompletedEvents);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Notification<T>> getOnCompletedEvents() {
        return Collections.unmodifiableList(this.onCompletedEvents);
    }

    public List<Throwable> getOnErrorEvents() {
        return Collections.unmodifiableList(this.onErrorEvents);
    }

    public List<T> getOnNextEvents() {
        return Collections.unmodifiableList(this.onNextEvents);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.onCompletedEvents.add(Notification.createOnCompleted());
        this.delegate.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.onErrorEvents.add(th2);
        this.delegate.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.onNextEvents.add(t10);
        this.delegate.onNext(t10);
    }

    public TestObserver() {
        this.onNextEvents = new ArrayList();
        this.onErrorEvents = new ArrayList();
        this.onCompletedEvents = new ArrayList();
        this.delegate = (Observer<T>) INERT;
    }
}
