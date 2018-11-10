package org.jbakery.extensions.hibernate;

public class ImplicitNamingStrategyProhibitedException
	extends RuntimeException
{
	public ImplicitNamingStrategyProhibitedException(String relation)
	{
		super(String.format("Relation \"%s\" must be explicitly named.", relation));
	}
}
