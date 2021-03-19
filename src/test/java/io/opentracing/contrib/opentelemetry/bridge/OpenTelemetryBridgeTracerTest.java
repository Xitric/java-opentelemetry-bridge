package io.opentracing.contrib.opentelemetry.bridge;

import io.opentracing.Tracer;
import io.opentracing.contrib.tracerresolver.TracerResolver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Kasper
 */
public class OpenTelemetryBridgeTracerTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tests that the TracerFactory can actually be resolved using opentracing-tracerresolver.
	 */
	@Test
	public void canBeResolved() {
		Tracer tracer = TracerResolver.resolveTracer(ClassLoader.getSystemClassLoader());
		assertNotNull(tracer);
	}

	@After
	public void tearDown() throws Exception {
	}
}