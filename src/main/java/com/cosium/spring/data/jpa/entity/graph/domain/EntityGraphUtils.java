package com.cosium.spring.data.jpa.entity.graph.domain;

import java.util.List;

/**
 * Created on 22/11/16.
 *
 * @author Reda.Housni-Alaoui
 */
public class EntityGraphUtils {

	private static final EntityGraph EMPTY_ENTITY_GRAPH = new EmptyEntityGraph();

	/**
	 * @return An empty EntityGraph
	 */
	public static EntityGraph empty() {
		return EMPTY_ENTITY_GRAPH;
	}

	/**
	 * @param name The name of the targeted EntityGraph
	 * @return An EntityGraph referenced by name
	 */
	public static EntityGraph fromName(String name) {
		return new NamedEntityGraph(name);
	}

	/**
	 *
	 * @param name The name of the targeted EntityGraph
	 * @param optional Is the EntityGraph usage optional?
	 * @return An EntityGraph referenced by name
	 */
	public static EntityGraph fromName(String name, boolean optional){
		NamedEntityGraph namedEntityGraph = new NamedEntityGraph(name);
		namedEntityGraph.setOptional(optional);
		return namedEntityGraph;
	}

	private static final class EmptyEntityGraph implements EntityGraph {

		@Override
		public EntityGraphType getEntityGraphType() {
			return null;
		}

		@Override
		public String getEntityGraphName() {
			return null;
		}

		@Override
		public List<String> getEntityGraphAttributePaths() {
			return null;
		}

		@Override
		public boolean isOptional() {
			return false;
		}
	}
}
