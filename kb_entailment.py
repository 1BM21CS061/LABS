def implies(p, q):
    # If p then q
    return not p or q

def create_knowledge_base():
    # Define knowledge base using logical statements
    knowledge_base = [
        lambda x: implies(x[0], x[1]),
        lambda x: implies(x[1], x[2]),
        lambda x: not x[2]
    ]
    return knowledge_base

def generate_truth_combinations():
    # Generate all possible combinations of truth values for p, q, r
    combinations = [(p, q, r) for p in [True, False] for q in [True, False] for r in [True, False]]
    return combinations

def query_entails(knowledge_base, query, combinations):
    # Check if the knowledge base entails the query for all truth combinations
    for c in combinations:
        s = all(rule(c) for rule in knowledge_base)
        f = query(c)
        if s != f and s is not False:
            return 'Does not entail'
    return 'Entails'

if __name__ == "__main__":
    # Create the knowledge base
    kb = create_knowledge_base()

    # Define a query
    query = lambda x: x[0]  # Assuming you are checking if p is entailed

    # Generate all truth combinations
    truth_combinations = generate_truth_combinations()

    # Check if the query entails the knowledge base for all truth combinations
    result = query_entails(kb, query, truth_combinations)

    # Display the results
    print("Knowledge Base Rules:", kb)
    print("Query:", query)
    print("Result for all truth combinations:", result)
