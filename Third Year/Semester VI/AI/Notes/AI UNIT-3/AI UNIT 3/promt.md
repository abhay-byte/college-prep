i will provided you with notes, (topics: Game Playing, minimax search, Alfa beta cut‐offs, Natural Language Processing, Learning, Explanation‐based
learning, discovery, analogy, Neural net learning and Genetic Learning.) format the entire notes with proper headings/questions for topic. please return result for above changes ? notes extracted: Artificial Intelligence

Open Elective
Module 5: Learning CH15

Dr. Santhi Natarajan
Associate Professor
Dept of AI and ML
BMSIT, Bangalore

Contents
• What is learning
• ROTE learning
• Learning by taking advice

• Learning in problem solving
• Learning from examples: induction
• Explanation based learning
• Discovery
• Analogy

• Formal learning theory
• Neural net learning and genetic learning

2

What is learning
• Denotes changes in the system that enable a system to do the same task more
efficiently next time.
• Learning is constructing or modifying representations of what is being
experienced.
• Learning is making useful changes in our minds.
• Learning improves understanding and efficiency
• Discover new things or structures which were previously unknown (data mining,
scientific discovery)
• Fill in skeletal or incomplete observations or specifications about a domain (this
expands the domain of expertise and lessens the brittleness of the system)
• Build software agents that can adapt to their users or to other software agents
• Reproduce an important aspect of intelligent behaviour.

3

Learning Systems
• Machine learning systems perform the following iteratively:
➢ Produce a result
➢ Evaluate it against expected result
➢ Tweak a system
• Machine learning systems also discover patterns without prior expected results

• Open box: changes are clearly visible in the knowledge base and clearly
interpretable by the human users.
• Black box: changes done to the system are not readily visible or understandable.

4

Learner Architecture
• Machine learning systems has the four main components:
➢ Knowledge Base (KB):
✓ what is being learnt
✓ Representation of domain
✓ Description and representation of problem space
➢ Performer: does something with the knowledge base to produce results.
➢ Critic: evaluates results produced against expected results
➢ Learner: takes output from the critic and modifies something in the KB or the
performer.
➢ They may also need a problem generator to test performance against.

.

5

Learning Agent Architecture

6

Learning Examples
Problem

Representation

Performer (interacts
with human)

Critic (human player)

Learner(elicits new
questions to modify
KBP

Animal guessing
game

Binary decision tree

Walk the tree and ask
associated questions

Human feedback

Elicit a question from
the user and add it to
the binary tree

Playing chess

The board layout, game
rules, moves

Chain through the rules
to identify move, use
conflict resolution to
choose one, output the
move.

Who won (credit
assignment problem)

Increase the weight for
some rules and
decrease for others.

Categorizing
documents

Vector of word frequencies,
corpus of documents

Apply appropriate
functions to identify
which category the file
belongs to

A set of humancategorized documents

Modify the weights on
the function and
improve categorization

Fixing computers

Frequency matrix of causes
and symptoms

Use known symptoms
to identify potential
causes.

Human input about
symptoms and cause
observed for a specific
case

Update the frequency
matrix with actual
symptoms and
outcomes

Identifying digits in
Optical Character
Recognition

Probability of digits, matrix
of pixels, percentage of
light, no: of straight lines

Input the features for a
digit, output probability
that it is one in the set
from 0 to 9.

Human categorized
training set

Modify the weights on
the network of
associations

7

Learning Paradigms
Paradigm

Description

Rote learning

Knowledge engineering: direct entry of rules and facts

Learning by taking
advice

Human/system interaction producing explicit mapping

Learning in problem
solving

Parameter adjustments

Learning from
examples: induction

Using specific examples to reach general conclusions

Explanation based
learning

Learn from a single example and later generalize. More analytical and
knowledge intensive approach.

Learning through
discovery

Unsupervised, specific goal not given

Learning through
analogy

Determining correspondence between two different representations:
case-based reasoning

Formal learning theory

Formal mathematical model of learning

Neural net learning and Evolutionary search techniques, based on an analogy to the “survival
genetic learning
of the fittest”
8

Rote Learning
• Rote learning is the basic learning activity.
• It is also called memorization because the knowledge, without any modification is,
simply copied into the knowledge base. Direct entry of rules and facts
• Knowledge base is captured knowledge.
• Traditional approach to develop ontologies.
• Data caching to improve performance.

• As computed values are stored, this technique can save a significant amount of time.
• Rote learning technique can also be used in complex learning systems provided
sophisticated techniques are employed to use the stored values faster and there is a
generalization to keep the number of stored information down to a manageable level.
• Checkers-playing program, for example, uses this technique to learn the board
9
positions it evaluates in its look-ahead search.

Rote Learning
• Depends on two important capabilities of complex learning systems:
➢ Organized storage of information: need sophisticated techniques for data
retrieval. It will be much faster than recomputing the data.
➢ Generalization: The number of distinct objects that might potentially be stored
can be very large. To keep the number of stored objects down to a manageable
levels.

10

Learning by taking advice
• This type is the easiest and simple way of learning.

• In this type of learning, a programmer writes a program to give some instructions to
perform a task to the computer. Once it is learned (i.e. programmed), the system will
be able to do new things.
• Also, there can be several sources for taking advice such as humans(experts),
internet etc.
• However, this type of learning has a more necessity of inference than rote learning.
• As the stored knowledge in knowledge base gets transformed into an operational
form, the reliability of the knowledge source is always taken into consideration.
• The programs shall operationalize the advice by turning it into a single or multiple
expressions that contain concepts and actions that the program can use while under
execution.
• This ability to operationalize knowledge is very critical for learning. This is also an
11
important aspect of Explanation Based Learning (EBL).

Learning in Problem Solving
• When the program does not learn from advice, it can learn by generalizing from its
own experiences.
➢ Learning by parameter adjustment

➢ Learning with macro-operators
➢ Learning by chunking
➢ The unity problem

12

Learning in Problem Solving
Learning by parameter adjustment
•

Here the learning system relies on evaluation procedure that combines information from
several sources into a single summary static.

•

For example, the factors such as demand and production capacity may be combined into a
single score to indicate the chance for increase of production.

•

But it is difficult to know a priori how much weight should be attached to each factor.

•

The correct weight can be found by taking some estimate of the correct settings and then allow
the program modify its settings based on its experience.

•

Features that appear to be good predictors of overall success will have their weights
increases, while those that do not will have their weights decreased.

•

This type of learning systems is useful when little knowledge is available.

•

In game programs, for example, the factors such as piece advantage and mobility are
combined into a single score to decide whether a particular board position is desirable. This
single score is nothing but a knowledge which the program gathered by means of calculation.
13

Learning in Problem Solving
Learning by parameter adjustment

• Programs do this in their static evaluation functions, in which a variety of factors
are combined into a single score. This function as a polynomial form is given
below:

• The t terms are the values of the features that contribute to the evaluation. The
c terms are the coefficients or weights that are attached to each of these
values. As learning progresses, the c values will change.

• In designing programs it is often difficult to decide on the exact value to give
each weight initially. So the basic idea of idea of parameter adjustment is to:
➢ Start with some estimate of the correct weight settings.
➢ Modify the weight in the program on the basis of accumulated experiences.
➢ Features that appear to be good predictors will have their weights
increased and bad ones will be decreased.
14

Learning in Problem Solving
Learning by parameter adjustment

• Important factors that affect the performance are:
➢ When should the value of a coefficient be increased and when should it be
decreased
✓ The coefficients of terms that predicted the final outcome accurately
should be increased, while the coefficients of poor predictors should
be decreased.
✓ The problem of appropriately assigning responsibility to each of the
steps that led to a single outcome is known as credit assignment
system.
➢ By how much should be value be changed.
• Learning procedure is a variety of hill-climbing.
• This method is very useful in situations where very little additional knowledge is
available or in programs in which it is combined with more knowledge intensive
methods.
15

Learning in Problem Solving
Learning with Macro-Operators
•
•
•

•
•

•

•
•

•

Sequence of actions that can be treated as a whole are called macro-operators.
Once a problem is solved, the learning component takes the computed plan and stores it
as a macro-operator.
The preconditions are the initial conditions of the problem just solved, and its post
conditions correspond to the goal just achieved.
The problem solver efficiently uses the knowledge base it gained from its previous
experiences.
By generalizing macro-operators the problem solver can even solve different problems.
Generalization is done by replacing all the constants in the macro-operators with
variables.
The STRIPS, for example, is a planning algorithm that employed macro-operators in it’s
learning phase. It builds a macro operator MACROP, that contains preconditions, postconditions and the sequence of actions. The macro operator will be used in the future
operation.
The set of problems for which macro-operators are critical are exactly those problems
with non-serializable sub goals.(working on one subgoal will necessarily interfere with the
previous solution to another subgoal).
One macro operator can produce a small global change in the world, even though the
individual operators that make it up produce many undesirable local changes.
Domain specific knowledge we need can be learnt in the form of macro operators. 16

Learning in Problem Solving
Learning by chunking
•

Chunking is similar to learnig with macro-operators. Generally, it is used by problem
solver systems that make use of production systems.

•

A production system consists of a set of rules that are in if-then form. That is given a
particular situation, what are the actions to be performed. For example, if it is raining then
take umbrella.

•

Production system also contains knowledge base, control strategy and a rule applier. To
solve a problem, a system will compare the present situation with the left hand side of the
rules. If there is a match then the system will perform the actions described in the right
hand side of the corresponding rule.

•

Problem solvers solve problems by applying the rules. Some of these rules may be more
useful than others and the results are stored as a chunk.

•

Chunking can be used to learn general search control knowledge.

•

Several chunks may encode a single macro-operator and one chunk may
participate in a number of macro sequences.
17

Learning in Problem Solving
Learning by chunking
•

Chunks learned in the beginning of problem solving, may be used in the later stage. The
system keeps the chunk to use it in solving other problems.

•

Soar is a general cognitive architecture for developing intelligent systems. Soar requires
knowledge to solve various problems. It acquires knowledge using chunking mechanism.
The system learns reflexively when impasses have been resolved. An impasse arises
when the system does not have sufficient knowledge. Consequently, Soar chooses a new
problem space (set of states and the operators that manipulate the states) in a bid to
resolve the impasse. While resolving the impasse, the individual steps of the task plan
are grouped into larger steps known as chunks. The chunks decrease the problem space
search and so increase the efficiency of performing the task.

•

In Soar, the knowledge is stored in long-term memory. Soar uses the chunking
mechanism to create productions that are stored in long-term memory. A chunk is nothing
but a large production that does the work of an entire sequence of smaller ones. The
productions have a set of conditions or patterns to be matched to working memory which
consists of current goals, problem spaces, states and operators and a set of actions to
perform when the production fires. Chunks are generalized before storing. When the
same impasse occurs again, the chunks so collected can be used to resolve it.
18

Learning in Problem Solving
The Utility Problem
•

•

•
•
•

The utility problem in learning systems occurs when knowledge learned in an attempt to
improve a system's performance degrades it instead.
The problem appears in many AI systems, but it is most familiar in speedup learning.
Speedup learning systems are designed to improve their performance by learning control
rules which guide their problem-solving performance. These systems often exhibit the
undesirable property of actually slowing down if they are allowed to learn in an
unrestricted fashion.
Each individual control rule is guaranteed to have a positive utility (improve performance)
but, in concert, they have a negative utility (degrade performance).
One of the causes of the utility problem is the serial nature of current hardware. The more
control rules that speedup learning systems acquire, the longer it takes for the system to
test them on each cycle.
One solution to the utility problem is to design a parallel memory system to eliminate the
increase in match cost. his approach moves the matching problem away from the central
processor and into the memory of the system. These so-called active memories allow
memory search to occur in "nearly constant-time" in the number of data items, relying on
the memory for fast, simple inference and reminding.

19

Learning in Problem Solving
The Utility Problem
•

PRODIGY program maintains a utility measure for each control rule. This measure takes
into account the average savings provided by the rule, the frequency of its application and
the cost of matching it.

•

If a proposed rule has a negative utility, it is discarded or forgotten.

•

If not, it is placed in long term memory with the other rules. It is then monitored during
subsequent problem solving.
If its utility falls, the rule I discarded.

•
•

Empirical experiments have demonstrated the effectiveness of keeping only those control
rules with high utility.

•

Such utility considerations apply to a wide range of learning problems.

20

Learning by Analogy
Learning by analogy means acquiring new knowledge about
an input entity by transferring it from a known similar entity.

Qa=3

Qb=9
Qc=?

Simple Hydraulics Problem

I1

I2
I3=I1+I2

Kirchoff's First Law

One may infer, by analogy, that hydraulics laws are similar to Kirchoff's
laws, and Ohm's law.
21

Learning by Analogy
Central intuition supporting learning by analogy:
If two entities are similar in some respects then they
could be similar in other respects as well.
Examples of analogies:

Pressure Drop is like Voltage Drop
A variable in a programming language is like a box.

22

Transformational Analogy
Look for a similar solution and copy it to the
new situation making suitable substitutions
where appropriate.
E.g. Geometry.
If you know about lengths of line segments and
a proof that certain lines are equal then we can
make similar assertions about angles.

We know that lines RO = NY and
angles AOB = COD
We have seen that RO + ON = ON + NY additive rule.
So we can say that
angles AOB + BOC = BOC + COD
So by a transitive rule line RN = OY
So similarly angle AOC = BOD

23

Derivational Analogy
Two problems share significant aspects if they match within a certain
threshold, according to a given similarity metric.

The solution to the retrieved problem is perturbed incrementally until it
satisfies the requirements of the new problem.
Transformational analogy does not look at how the problem was solved -- it
only looks at the final solution. The history of the problem solution - the steps
involved - are often relevant.

New derivation

Old derivation

24

Derivational Analogy
GIVEN: AB = CD
PROVE: AC = BD
D
C
B
A

AB = CD
BC = BC
AB + BC = BC + CD
AC = BD

 = ( AB <- <BAC
CD < - <DAE
AC <- <BAD
BD < - <CAE )

GIVEN: <BAC = <DAE
PROVE: <BAD = <CAE
C
B
D
A

E

<BAC = <DAE
<CAD = <CAD
<BAC + <CAD= <CAD + <DAE
<BAD = <CAE

25

Explanation based Learning

26

Explanation based Learning

27

Explanation based Learning

28

Explanation based Learning

29

Explanation based Learning

30

Explanation based Learning

31

Learning by Discovery
An entity acquires knowledge without the help of a teacher.

Theory Driven Discovery - AM (1976)
AM is a program that discovers concepts in elementary mathematics and set
theory.
AM has 2 inputs:
• A description of some concepts of set theory (in LISP form). E.g. set union,
intersection, the empty set.
• Information on how to perform mathematics. E.g. functions.
How does AM work?
AM employs many general-purpose AI techniques:
• A frame based representation of mathematical concepts.
AM can create new concepts (slots) and fill in their values.
• Heuristic search employed
250 heuristics represent hints about activities that might lead to interesting
discoveries.
How to employ functions, create new concepts, generalisation etc.
• Hypothesis and test based search.
32
• Agenda control of discovery process.

Learning by Discovery
AM discovered:

• Integers-- it is possible to count the elements of this set and this is an the
image of this counting function -- the integers -- interesting set in its own right.
• Addition-- The union of two disjoint sets and their counting function

• Multiplication-- Having discovered addition and multiplication as laborious
set-theoretic operations more effective descriptions were supplied by hand.
• Prime Numbers-- factorisation of numbers and numbers with only one factor
were discovered.
• Golbach's Conjecture-- Even numbers can be written as the sum of 2
primes. E.g. 28 = 17 + 11.
• Maximally Divisible Numbers-- numbers with as many factors as possible. A
number k is maximally divisible is k has more factors than any integer less
than k. E.g. 12 has six divisors 1,2,3,4,6,12.
33

Learning by Discovery
Data Driven Discovery -- BACON (1981)

Many discoveries are made from observing data obtained from the world and making
sense of it -- E.g. Astrophysics - discovery of planets, Quantum mechanics - discovery of
sub-atomic particles.
BACON is an attempt at providing such an AI system. BACON system outline:
• Starts with a set of variables for a problem.
➢ E.g. BACON was able able to derive the ideal gas law. It started with four
variables p - gas pressure, V -- gas volume, n -- molar mass of gas, T -- gas
temperature. Recall pV/nT = k where k is a constant.

• Values from experimental data from the problem are inputted.
• BACON holds some constant and attempts to notice trends in the data.
• Inferences made.
BACON has also been applied to Kepler's 3rd law, Ohm's law, conservation of
momentum and Joule's law.

34

Learning by Discovery
Clustering

• Clustering involves grouping data into several new classes.
• It is a common descriptive task where one seeks to identify a finite set of categories
or clusters to describe the data. For example, we may want to cluster houses to find
distribution patterns.
• Clustering is the process of grouping a set of physical or abstract objects into
classes of similar objects.
• A cluster is a collection of data objects that are similar to one another within the same
cluster and are dissimilar to the objects in other clusters. Clustering analysis helps
construct meaningful partitioning of a large set of objects.

35

Learning by Discovery
Clustering

The task of clustering is to maximize the intra-class similarity and minimize the interclass
similarity.
• Given N k-dimensional feature vectors, find a "meaningful" partition of the N
examples into c subsets or groups
• Discover the "labels" automatically
• c may be given, or "discovered“
• much more difficult than classification, since in the latter the groups are given, and we
seek a compact description

36

Learning by Discovery
AutoClass
• AutoClass is a clustering algorithm based upon the Bayesian approach for
determining optimal classes in large datasets.
·
• Given a set X={X1, …, Xn} of data instances Xi with unknown classes, the goal of
Bayesian classification is to search for the best class description that predicts the
data in a model space.
·
• Class membership is expressed probabilistically.
• An instance is not assigned to a unique class, but it has a probability (expressed as
weight values) of belonging to each of the possible classes.
• AutoClass calculates the likelihood of each instance belonging to each class C and
then calculates a set of weights wij=(Ci / SjCj) for each instance.
• Weighted statistics relevant to each term of the class likelihood are calculated for
estimating the class model.
• The classification step is the most computationally intensive. It computes the weights
37
of every instance for each class and computes the parameters of a classification.

Formal Learning
Formal learning theory
•

Theory of the learnable by Valiant: classifies problems by how difficult they are to learn.

•

Formally, a device can learn a concept if it can, given positive and negative examples,
produce an algorithm that will classify future examples correctly with probability 1/h.

•

Complexity of learning a function is decided by three factors:
➢ The error tolerance (h)
➢ The number of binary features present in the example (t)
➢ Size of rules necessary to make the discrimination (f)

•

If the number of training examples is a polynomial in h,t, f, then the system is said to be
trainable.

•

Example: learning feature descriptions

•

Mathematical theory will be used to quantify the use of knowledge

38

Formal Learning

39

Other Learning Models
Neural net learning and genetic learning
•

Neural networks

•

Population genetics and selection

40

Learning in Problem Solving
Neural net learning and genetic learning
•

Neural networks

•

Population genetics and selection

41

What is learning

42

What is learning

43Introduction to Natural Language
Processing
Asif Ekbal
Dept. of Computer Science and Engineering
IIT Patna, Patna, India
Email: asif@iitp.ac.in, asif.ekbal@gmail.com

Problem
Semantics

NLP
Trinity

Parsing
Part of Speech
Tagging

Discourse and Coreference
Increased
Complexity
Of
Processing

Morph
Analysis

Semantics

Marathi

HMM

Hindi

Parsing
MEMM

Algorithm

Chunking
RNN

POS tagging

Morphology

English

Language

CRF

2

French

Multilinguality: Indian situation
 Major streams

 Indo European
 Dravidian
 Sino Tibetan
 Austro-Asiatic
 Some languages are ranked

within 20 in in the world in
terms of the populations
speaking them
 Hindi : 4th (~350 milion)
 Bangla: 5h (~230 million)
 Marathi 10th (~84 million)

Language Technology or Natural Language
Processing: Background & Relevance in
Indian Scenario

Background: Indian Context
 India is a multi-lingual country with great linguistic and cultural

diversities
 22 official languages mentioned in the Indian constitution
 However, Census of India in 2001 reported 122 major languages
 1,599 other regional languages
 2,371 scripts
 30 languages are spoken by more than one million native
speakers
 122 are spoken by more than 10,000 people
 20% understand English
 80% cannot understand

Background
 Phenomenal growth in the number of internet users, social media

(Facebook,Twitter etc.)
 Increasing tendency of using Indian language contents for
exchanging information
 Digital divide cannot be tackled unless citizens are given
flexibility in communicating in their own languages
Language Technology or Natural Language Processing (NLP)
that deals with developing theories and techniques for effective
communication in human languages play an important role
towards creating this digital society

TDIL: MeiTY, Govt. of India
 Technology Development for Indian Languages (TDIL)

Programme
 Objective:
 developing Information Processing Tools and Techniques to facilitate

human-machine interaction without language barrier;
 creating and accessing multilingual knowledge resources; and
 integrating them to develop innovative user products and services

TDIL: Some major initiatives
 Development of English to Indian Language Machine Translation

(Anuvadaksh):
English to Hindi/Marathi/Bangla/Oriya/Tamil/Urdu/Gujrati/Bodo
 Development of English to Indian Language Machine Translation
System
with
Angla-Bharti
Technology:
English
to
Bangla/Punjabi/Malaylam/Urdu/Hindi/Telugu
 Development of Indian Language to Indian Language Machine
Translation System (Sampark)- 18 pairs of languages
-Hindi to Bengali, Bengali to Hindi, Marathi to Hindi, Hindi to Marathi, Hindi to
Punjabi, Punjabi to Hindi, Hindi to Tamil, Tamil to Hindi, Hindi to Kannada, Kannada
to Hindi, Hindi to Telugu, Telugu to Hindi, Hindi to Urdu, Urdu-Hindi, Malaylam to
Tamil,Tamil to Malaylam,Tamil to Telugu,Telugu to Tamil

TDIL: Some major initiatives
 Development of Cross-Lingual Information Access (CLIA)
 Assamese, Bengali, Hindi, Oriya, Punjabi, Tamil, Telugu, Marathi
 Development of Robust Document Analysis & Recognition System

for Indian Languages (OCR)-14 languages
 Assamese, Bengali, Devanagri, Gujrati, Gurumukhi, Kannada,
Malaylam, Manipuri, Marathi, Oriya, Tamil, Telugu, Tibetan, Urdu
 Development of Text to Speech System in Indian Languages
 Development of Automatic Speech Recognition System in Indian
Languages
 Development of Hindi to English Machine Translation in Judicial Domain

A Case-Study: MyGov.in Portal

Govt. Portal: MyGov.in

Govt. Portal: MyGov.in
 Citizen-centric platform empowers people to connect with

the Government & contribute towards good governance
 Unique first of its kind participatory governance initiative
involving the common citizen at large
 Idea is to bring the government closer to the common man by
the use of online platform creating an interface for healthy
exchange of ideas and views involving the common citizen
and experts
 Ultimate goal is to contribute to the social and economic
transformation of India
 Was launched on July 26, 2014 by the Hon’ble PM

Govt. Portal: MyGov.in
 This has been more than successful in keeping the citizens

engaged on important policy issues and governance, be it
Clean Ganga, Girl Child Education, Skill Development
and Healthy India to name a few
 Has become a key part of the policy and decision making
process of the country
 Platform has been able
 to provide the citizens a voice in the governance process of the country

and
 create grounds for the citizens to become stakeholders not only in policy
formulation and recommendation but also implementation through
actionable tasks

Govt. Portal: MyGov.in
 Major attributes: Discussion, Tasks, Talks, Polls and Blogs on

various groups based on the diverse governance and public policy
issues
 Has more than 1.78 Million users who contribute their

ideas through discussions and also participate through the
various earmarked tasks
 Platform gets more than 10,000 posts per weeks on various
issues
Feedbacks are analyzed and put together as suggestions for the
concerned departments which are responsible to transform them
into actionable agenda

 Infeasible to mine the most relevant information from this

huge data

 Needs a method for automated analysis of this data
 Demands sophisticated NLP and ML techniques to

build these

Code-mixing
 Code-mixing refers to the mixing of two or more languages or

language varieties in speech/text
Kolkata to Varanasi ka kya distance hai

Entity

English

Hindi

16

Code-Mixing in MyGov.in: Few Examples
 Sir ji aapka ye abhiyan acha ha isse naye bharat ka nirman hoga maine

apne school ke student ke sath milkar hospital ki safai ki and jagrukta
rali nikali jisse log gandagi kam failaye.
 Aaj her school main swachta abhiyan honi chye we do it
 india ko clean rakhne ke lie gandgi karne walo pe penalty lagani chahiye
jo kaam das sal me hoga penalty lagane ke bad wo kuch hi dino me ho
jaega
 Modi sir swachh bharat m aapke bjp poltician photo click krawane k liye
safai krte h sathinye neta sirf pik click krte h bs.
 Our School also participated in Clean India Campaign . The students of
class XII cleaned a Park and a Basket Ball area .

Why to Analyse?
 Public opinions play important roles for the betterment of human

lives
 Huge volumes and varieties of user-generated contents and user
interaction networks constitute new opportunities for
understanding social behavior
 Understanding deep feeling of public can help government to
anticipate deep social changes and adapt to population
expectations
Discipline known as Opinion Mining or Sentiment Analysis

NLP: Projected Growth
 Growing in an exponential manner

 Expected to touch the market of $16 billion in 2021
 With compound growth rate of 16% annually

 Reasons behind this growth
 Rising of the Chatbots
 Urge of discovering the customer insights
 Transfer of technology of messaging from manual to automated
 Translation of contents, and
 many other tasks which are required to be automated and involve

language/Speech at some point
 Etc.
Major Industries: Amazon, Google, Microsoft, Facebook, IBM etc.

NLP: Evolution
 Evolving

from human-computer interaction to humancomputer conversation

 The first critical part of NLP Advancements – Biometrics
 The second critical part of NLP advancements–Humanoid

Robotics

NLP: In Governance
 NLP techniques for the delivery to the common people and to

decrease the interaction gap between the citizen and the
Government
 Uses of NLP in Government Websites
 Making e-governance related information to be available in multiple

languages
 Natural Language Generation in e-Governance
 Chatbot
 E.g. farmer can not read or write, but with the multilingual support

and NLP generation, s/he can communicate the query in any language
and get it resolved

NLP: In Business, Healthcare
 Sentiment Analysis: Analyzing public opinion

 Email Filters: Filtering out irrelevant emails
 Voice Recognition: Developing smart voice-driven services
 Information Extraction
 NLP in Healthcare
 main concern and priority in nowadays the healthcare system is to provide

better and 24/7 EHR experience
 Voice-support systems, Predictive systems, Prescriptive analytics)
 NLP in Healthcare
 can be used to reduce the communication and interaction gap between
Healthcare technologies (such as patient portals which contain health records of
a patient) and patients
 Patients can interact in his/her own language
 Easier for a patient to understand health status

NLP: In Healthcare
 Increasing the dimension of high quality of care

 Healthcare reports generally contain parameters which require proper

attention
 Use of NLP can provide significant relief in case of calculating the
measure of inpatient care and monitoring the clinical guidelines
 Identification of the patients which require Improved Care

Coordination
 Automated detection of cancer, detection of the root causes related to
any substance disorder are some of the examples

NLP: In Finance
 Credit Scoring Method
 Estimate risk factor of giving loan with the past histories
 E.g. Lenddo EFL (with 115 employees), a Singapore-based company

developed a software called Lenddo Score which uses machine
learning and NLP to assess and calculate an individual’s
creditworthiness.
 Document search
 Nuance Communications based in Massachusetts developed software

known as Nuance Document Finance Solution, which is used to aid
financial services companies in automatizing the documentation
process
 Fraud detection in banking
 Stock market prediction- based on sentiment

NLP: In Other domains
 National Security

 Sentiment in Cross-border languages
 Hate Speech, Radicalization
 NLP in Recruitment
 searching the appropriate applications from the data, and it also can

be used for selecting the best applications from the data available

Natural Language Processing (NLP)
 NLP is the branch of computer science focused on developing

systems that allow computers to communicate with people using
everyday language
 Related to Computational Linguistics
 Also

concerns how computational methods can aid the
understanding of human language

26

Perspectives of NLP: Areas of AI and their
inter-dependencies

Search

Logic

Machine
Learning

NLP

Vision

Knowledge
Representation

Planning

Robotics

Expert
Systems

Evaluation Challenges
 Message

Understanding Conference (MUC): Information Extraction
(http://www.cs.nyu.edu/cs/faculty/grishman/muc6.html)
 Text
Retrieval
Conference
(TREC):
Information
Retrieval
(http://trec.nist.gov/)
 Document
Understanding
Conference
(DUC):
Summarization
(http://duc.nist.gov/duc2003/call.html)
 Automatic
Content Extraction (ACE): Information Extraction
(http://www.itl.nist.gov./iad/894.01/tests/ace/2004/)
 Evaluation exercises on Semantic Evaluation (SemEval): WSD, Coreferences
etc. (http://en.wikipedia.org/wiki/SemEval)
 Cross Language Evaluation Forum (CLEF): Cross-lingual Information retrieval
(http://www.clef-initiative.eu//)
 Recognising Textual Entailment Challenge (RTE): Textual entailment
(http://www.pascal-network.org/Challenges/RTE/ )
28

Evaluation Challenges
 Morpho

Challenge: unsupervised segmentation of words into morphemes
(http://www.cis.hut.fi/morphochallenge2005/)

 Web

People Search Evaluation Challenges (WePS): Information Extraction
(http://nlp.uned.es/weps/weps-2/)

 CoNLL

challenges:
Chunking,
(http://www.cnts.ua.ac.be/conll/)

Named

Entity

 Text

Analysis
Conference
(TAC):
(http://pascallin.ecs.soton.ac.uk/Challenges/RTE/)

extraction
Entailment

etc.
etc.

 BioCreative challenges: Biomedical text mining (http://biocreative.sourceforge.net/)
 Biomedical information extraction challenges
 JNLPBA (http://www-tsujii.is.s.u-tokyo.ac.jp/GENIA/ERtask/report.html)
 BioNLP 2009 (http://www-tsujii.is.s.u-tokyo.ac.jp/GENIA/SharedTask/)
 BioNLP 2011 (http://2011.bionlp-st.org/)
 BioNLP 2013 , 2014, 2015, 2016 etc.

 SemEval: Sentiment, Emotion, Question-Answering etc.
29

Allied Disciplines
Philosophy

Semantics, Meaning of “meaning”, Logic
(syllogism)

Linguistics

Study of Syntax, Lexicon, Lexical Semantics etc.

Probability and Statistics

Corpus Linguistics, Testing of Hypotheses,
System Evaluation

Cognitive Science

Computational Models of Language Processing,
Language Acquisition

Psychology

Behavioristic insights into Language Processing,
Psychological Models

Brain Science

Language Processing Areas in Brain

Physics

Information Theory, Entropy, Random Fields

Computer Sc. & Engg.

Systems for NLP

Definitions etc.

What is NLP?
 Branch of AI
 2 Goals
 Science Goal: Understand the way language operates
 Engineering Goal: Build systems that analyse and generate language;

reduce the man-machine gap

Two Views of NLP
1.
2.

33

Classical View
Statistical/Machine Learning View

The famous Turing Test: Language based Interaction
(Computing Machinery and Intelligence:1950)

Test conductor

Machine

Human

Can the test conductor find out which is the machine and which the human

Natural Languages vs. Computer Languages
 Ambiguity is the primary difference between natural and

computer languages
 Formal programming languages are designed to be
unambiguous, i.e. they can be defined by a grammar that
produces a unique parse (in general) for each sentence in the
language
 Programming languages are also designed for efficient
(deterministic) parsing, i.e. they are deterministic contextfree languages (DCFLs)
 A sentence in a DCFL can be parsed in O(n) time where n is the

length of the string

35

NLP architecture and stages of processingambiguity at every stage
 Phonetics and phonology
 Morphology
 Lexical Analysis
 Syntactic Analysis
 Semantic Analysis
 Pragmatics
 Discourse

36

Phonetics
 Processing of speech
 Challenges
 Homophones: bank (finance) vs. bank (river bank)
 Near Homophones: maatraa vs. maatra (Hin)
 Word Boundary
 aajaayenge (aa jaayenge (will come) or aaj aayenge (will come today)
 I got [ua]plate
 Phrase boundary

 PhD students are especially exhorted to attend as such seminars are integral to one's post-graduate

education
 Disfluency: ah, um, ahem etc.
The best part of my job is … well … the best part of my job is the responsibility.

Word Segmentation
 Breaking a string of characters (graphemes) into a sequence of

words
 In some written languages (e.g. Chinese) words are not
separated by spaces
 Even in English, characters other than white-space can be used
to separate words [e.g. , ; . - : ( ) ]
 Examples from English URLs:
 jumptheshark.com  jump the shark .com
 myspace.com/pluckerswingbar

 myspace .com pluckers wing bar
 myspace .com plucker swing bar

Morphological Analysis
 Morphology is the field of linguistics that studies the internal structure

of words (Wikipedia)
 A morpheme is the smallest linguistic unit that has semantic meaning
(Wikipedia)
 e.g. “carry”, “pre”, “ed”, “ly”, “s”

 Morphological analysis is the task of segmenting a word into its

morphemes:
 carried  carry + ed (past tense)
 independently  in + (depend + ent) + ly
 Googlers  (Google + er) + s (plural)
 unlockable  un + (lock + able) ?
 (un + lock) + able ?

Morphology
 Word formation rules from root words
 Nouns: Plural (boy-boys); Gender marking (czar-czarina)
 Verbs: Tense (stretch-stretched); Aspect (e.g. perfective sit-had sat);

Modality (e.g. request khaanaa khaaiie)
 Crucial first step in NLP
 Languages rich in morphology: e.g., Dravidian, Hungarian, Turkish,
Indian languages
 Languages poor in morphology: Chinese, English
 Languages with rich morphology have the advantage of easier
processing at higher stages of processing
 A task of interest to computer science: Finite State Machines for
Word Morphology

Lexical Analysis
 Essentially refers to dictionary access and obtaining the

properties of the word
e.g. dog
noun (lexical property)
take-’s’-in-plural (morph property)
animate (semantic property)
4-legged (-do-)
carnivore (-do)

Challenge: Lexical or word sense disambiguation

Lexical Disambiguation
First step: Part of Speech Disambiguation
 Dog as a noun (animal)
 Dog as a verb (to pursue or to go after)

Sense Disambiguation
 Dog (as animal)
 Dog (as a very detestable person)

Needs word relationships in a context
 The chair emphasized the need for adult education

Very common in day to day communications
Satellite Channel Ad: Watch what you want, when you want (two senses of watch)
Watch: wrist watch/watching something

Technological developments bring in new terms,
additional meanings/nuances for existing terms
 Justify as in justify the right margin (word processing context)
 Xeroxed: a new verb
 Digital Trace: a new expression
 Communifaking: pretending to talk on mobile when you are actually

not
 Discomgooglation: anxiety/discomfort at not being able to access
internet
 Helicopter Parenting: over parenting

Ambiguity of Multiwords
 The grandfather kicked the bucket after suffering from cancer.
 This job is a piece of cake
 Put the sweater on

 He is the dark horse of the match

Google Translations of above sentences:

दादा कैंसर से पीड़ित होने के बाद बाल्टी लात मारी.
इस काम के केक का एक टु क़िा है .
स्वेटर पर रखो.
वह मैच के अंधेरे घो़िा है .
44

Ambiguity of Named Entities
 Bengali: চঞ্চল সরকার বাড়িতে আতে

English: Government is restless at home. (*)
Chanchal Sarkar is at home
Amsterdam airport: “Baby Changing Room”
 Hindi: दै डनक दबं ग दु डनया

English: Daily domineering world

Actually name of a Hindi newspaper in Indore
 High degree of overlap between NEs and MWEs
 Treat differently - transliterate do not translate
45

Syntactic Tasks

Part of Speech (PoS) Tagging
 Annotate each word in a sentence with a PoS

I ate the spaghetti with meatballs.
Pro V Det
N
Prep
N
 Useful for subsequent syntactic parsing and word sense

disambiguation
John saw the saw and decided to take it to the table.
PN V Det N Con V Part V Pro Prep Det N

Phrase Chunking
 Find all non-recursive noun phrases (NPs) and verb phrases (VPs)

in a sentence
 [NP I] [VP ate] [NP the spaghetti] [PP with] [NP meatballs].
 [NP He ] [VP reckons ] [NP the current account deficit ] [VP will

narrow ] [PP to ] [NP only # 1.8 billion ] [PP in ] [NP September ]

Syntax Processing Stage
Structure Detection
S

VP

NP
V

NP

I
like

mangoes

Parsing Strategy
 Driven by grammar
 S-> NP VP
 NP-> N | PRON
 VP-> V NP | V PP
 N-> Mangoes
 PRON-> I

 V-> like

Challenges in Syntactic Processing:
Structural Ambiguity
 Scope
1.The old men and women were taken to safe locations
(old men and women) vs. ((old men) and women)
2. No smoking areas will allow Hookas inside

 Preposition Phrase Attachment
 I saw the boy with a telescope

(who has the telescope?)
 I saw the mountain with a telescope
(world knowledge: mountain cannot be an instrument of seeing)
 I saw the boy with the pony-tail
(world knowledge: pony-tail cannot be an instrument of seeing)
Very ubiquitous: newspaper headline “20 years later, BMC pays father 20 lakhs
for causing son’s death”

Structural Ambiguity…
 Overheard
 I did not know my PDA had a phone for 3 months
 An actual sentence in the newspaper
 The camera man shot the man with the gun when he was near

Tendulkar

 (Times of India, 26/2/08) Aid for kins of cops killed in terrorist

attacks

Headache for Parsing: Garden Path sentences
 Garden Pathing: A garden path sentence is a grammatically

correct sentence that starts in such a way that the readers' most likely
interpretation will be incorrect
 The horse raced past the garden fell The horse – (that was) raced past

the garden – fell
 The old man the boatThe boat (is manned) by the old
 Twin Bomb Strike in Baghdad kill 25 (Times of India 05/09/07) (Twin

Bomb Strike) in Baghdad kill 25

Semantic Tasks

Semantic Analysis
 Representation in terms of
 Predicate calculus/Semantic Nets/Frames/Conceptual Dependencies and Scripts
 John gave a book to Mary
 Give: action, Agent: John, Object: Book, Recipient: Mary
 Challenge: ambiguity in semantic role labeling
 (Eng)Visiting aunts can be a nuisance
 (Hin) aapko mujhe mithaai khilaanii padegii (ambiguous in Marathi and Bengali

too)
 Aapnaake aamake misti khoaate hobe

Word Sense Disambiguation (WSD)
 Words in natural language usually have a fair number of different

possible meanings

 Ravi has a strong interest in computer science
 Ravi pays a large amount of interest on his credit card

 For many tasks (question answering, translation), the proper sense of

each ambiguous word in a sentence must be determined

56

Semantic Role Labeling (SRL)
 For each clause, determine the semantic role played by each noun

phrase that is an argument to the verb

agent
patient source destination instrument
 John drove Mary from Austin to Dallas in his Toyota
 The hammer broke the window

 Also referred to a “case role analysis,” “thematic analysis,” and

“shallow semantic parsing”

57

Textual Entailment
 Determine whether one natural language sentence entails

(implies) another under an ordinary interpretation

Textual Entailment Problems:
from PASCAL Challenge
TEXT
Eyeing the huge market potential, currently
led by Google, Yahoo took over search
company Overture Services Inc last year.

HYPOTHESIS
Yahoo bought Overture.

ENTAIL
MENT

TRUE

Microsoft's rival Sun Microsystems Inc.
bought Star Office last month and plans to
boost its development as a Web-based
Microsoft bought Star Office.
device running over the Net on personal
computers and Internet appliances.

FALSE

The National Institute for Psychobiology in
Israel was established in May 1971 as the
Israel Center for Psychobiology by Prof.
Joel.

Israel was established in May
1971.

FALSE

Since its formation in 1948, Israel fought
many wars with neighboring Arab
countries.

Israel was established in
1948.

TRUE

Pragmatics/Discourse Tasks

Pragmatics
 Very hard problem
 Model user intention
 Tourist (in a hurry, checking out of the hotel, motioning to the service boy): Boy,

go upstairs and see if my sandals are under the divan. Do not be late. I just have
15 minutes to catch the train.
 Boy (running upstairs and coming back panting): yes sir, they are there.
 World knowledge
 WHY INDIA NEEDS A SECOND OCTOBER? (ToI, 2/10/07)

Discourse
Processing of sequence of sentences
Mother to John:
John go to school. It is open today. Should you bunk? Father will be very angry.
Ambiguity of open
bunk what?
Why will the father be angry?
Complex chain of reasoning and application of world knowledge
Ambiguity of father
father as parent
or
father as headmaster

Anaphora Resolution/ Co-Reference
 Determine which phrases in a document refer to the same

underlying entity

 John put the carrot on the plate and ate it.
 Bush started the war in Iraq. But the president needed the

consent of Congress.

 Some cases require difficult reasoning.
 Today was Jack's birthday. Penny and Janet went to the store. They were

going to get presents. Janet decided to get a kite. "Don't do that," said
Penny. "Jack has a kite. He will make you take it back."

Other Tasks

Information Extraction (IE)
 Identify phrases in language that refer to specific types of

entities and relations in text
 Named entity recognition is task of identifying names of
people, places, organizations, etc. in text
people organizations places
 Michael Dell is the CEO of Dell Computer Corporation and

lives in Austin Texas.

 Relation extraction identifies specific relations between

entities.

 Michael Dell is the CEO of Dell Computer Corporation and

lives in Austin Texas.

66

Question Answering
 Directly answer natural language questions based on information

presented in a corpora of textual documents (e.g. the web)
 When was Barack Obama born? (factoid)
 August 4, 1961

 Who was president when Barack Obama was born?
 John F. Kennedy
 How many presidents have there been since Barack Obama was

born?
9

Text Summarization
 Produce a short summary of a longer document or article
 Article: With a split decision in the final two primaries and a flurry of superdelegate

endorsements, Sen. Barack Obama sealed the Democratic presidential nomination last
night after a grueling and history-making campaign against Sen. Hillary Rodham Clinton
that will make him the first African American to head a major-party ticket. Before a
chanting and cheering audience in St. Paul, Minn., the first-term senator from Illinois
savored what once seemed an unlikely outcome to the Democratic race with a nod to the
marathon that was ending and to what will be another hard-fought battle, against Sen.
John McCain, the presumptive Republican nominee….

 Summary: Senator Barack Obama was declared the presumptive Democratic
presidential nominee.

Sentiment Analysis
 Sentiment analysis
 Extract subjective information usually from a set of documents, often

using online reviews to determine "polarity" about specific objects
 especially useful for identifying trends of public opinion in the social

media, for the purpose of marketing

69

Machine Translation (MT)
 Translate a sentence from one natural language to another.
 Hasta la vista, bebé 

Until we see each other again, baby.

Ambiguity Resolution is Required for Translation
 Syntactic and semantic ambiguities must be properly resolved

for correct translation:
 “John plays the guitar.” → “John toca la guitarra.”
 “John plays soccer.” → “John juega el fútbol.”

 An apocryphal story is that an early MT system gave the

following results when translating from English to Russian and
then back to English:
 “The spirit is willing but the flesh is weak.”  “The liquor is good

but the meat is spoiled.”
 “Out of sight, out of mind.”  “Invisible idiot.”

71

Resolving Ambiguity
 Choosing the correct interpretation of linguistic utterances

requires knowledge of:

 Syntax
 An agent is typically the subject of the verb
 Semantics
 Michael and Ellen are names of people
 Austin is the name of a city (and of a person)
 Toyota is a car company and Prius is a brand of car
 Pragmatics
 World knowledge
 Credit cards require users to pay financial interest
 Agents must be animate and a hammer is not animate

72

Manual Knowledge Acquisition
 Traditional, “rationalist” approaches to language processing

require human specialists to specify and formalize the
required knowledge
 Manual knowledge engineering is difficult, time-consuming,
and error prone
 “ Rules ” in language have numerous exceptions and
irregularities
 “All grammars leak.”: Edward Sapir (1921)

 Manually developed systems were expensive to develop and

their abilities were limited and “brittle” (not robust)

73

Automatic Learning Approach
 Use machine learning methods to automatically acquire the

required knowledge from appropriately annotated text
corpora
 Variously referred to as the “corpus based,” “statistical,”
or “empirical” approach
 Statistical learning methods were first applied to speech
recognition in the late 1970’s and became the dominant
approach in the 1980’s
 During the 1990 ’ s, the statistical training approach
expanded and came to dominate almost all areas of NLP
74

Learning Approach
Machine
Learning

Manually Annotated
Training Corpora

Linguistic
Knowledge

NLP System

75

Raw Text

Automatically
Annotated Text

Early History: 1950’s
 Shannon (the father of information theory)

explored

probabilistic models of natural language (1951)
 Chomsky (the extremely influential linguist) developed
formal models of syntax, i.e. finite state and context-free
grammars (1956)
 First computational parser developed at U Penn as a cascade
of finite-state transducers (Joshi, 1961; Harris, 1962)
 Bayesian methods developed for optical character recognition
(OCR) (Bledsoe & Browning, 1959).

History: 1960’s
 Work at MIT AI lab on question answering (BASEBALL) and

dialog (ELIZA)
 Semantic network models of language for question answering
(Simmons, 1965).
 First electronic corpus collected, Brown corpus, 1 million
words (Kucera and Francis, 1967)
 Bayesian methods used to identify document authorship (The
Federalist papers) (Mosteller &Wallace, 1964)

History: 1970’s
 “Natural language understanding” systems developed that

tried to support deeper semantic interpretation

 SHRDLU (Winograd, 1972) performs tasks in the “blocks world”

based on NL instruction
 Schank et al. (1972, 1977) developed systems for conceptual
representation of language and for understanding short stories using
hand-coded knowledge of scripts, plans, and goals.

 Prolog programming language developed to support logic-

based parsing (Colmeraurer, 1975).
 Initial development of hidden Markov models (HMMs) for
statistical speech recognition (Baker, 1975; Jelinek, 1976).

History: 1980’s
 Development of more complex (mildly context sensitive)

grammatical formalisms, e.g. unification grammar, tree-adjoning
grammar etc
 Symbolic work on discourse processing and NL generation.
 Initial use of statistical (HMM) methods for syntactic analysis
(POS tagging) (Church, 1988).

History: 1990’s
 Rise of statistical methods and empirical evaluation causes a

“scientific revolution” in the field
 Initial annotated corpora developed for training and testing
systems for POS tagging, parsing, WSD, information
extraction, MT, etc.
 First statistical machine translation systems developed at
IBM for Canadian Hansards corpus (Brown et al., 1990)
 First robust statistical parsers developed (Magerman, 1995;
Collins, 1996; Charniak, 1997)
 First systems for robust information extraction developed
(e.g. MUC competitions)

History: 2000’s
 Increased use of a variety of ML methods, SVMs, logistic

regression (i.e. max-ent), CRF’s, etc.
 Continued developed of corpora and competitions on shared
data.
 TREC Q/A
 SENSEVAL/SEMEVAL
 CONLL SharedTasks (NER, SRL…)

 Increased emphasis on unsupervised, semi-supervised, and

active learning as alternatives to purely supervised learning.
 Shifted focus to semantic tasks such asWSD and SRL.

History: 2000 onwards
 Information extraction from social networks
 Information retrieval
 Cross-lingual information access
 Machine Translation (statistical, hybrid etc.)
 Biomedical text mining
 Discourse processing

82

Machine Learning
 Machine learning: how to acquire a model on the basis of data /

experience?
 Learning parameters (e.g. probabilities)
 Learning structure (e.g. BN graphs)
 Learning hidden concepts (e.g. clustering)

Machine Learning
 Unsupervised Learning
 No feedback from teacher; detect patterns

 Reinforcement Learning
 Feedback consists of rewards/punishment

 Supervised Learning
 Examples of correct answers are given
 Discrete answers: Classification
 Continuous answers: Regression

Supervised Machine Learning
f(x)

f(x)

f(x)

x
(a)

f(x)

x
(b)

x
(c)

Given a training set:
(x1, y1), (x2, y2), (x3, y3), … (xn, yn)
Where each yi was generated by an unknown y = f (x),
Discover a function h that approximates the true function f

x
(d)

Example: Spam Filter
 Input: x = email
 Output: y = “spam” or “ham”
 Setup:
 Get a large collection of example

emails, each labeled “spam” or
“ham”
 Note: someone has to hand label all
this data!
 Want to learn to predict labels of new,
future emails
 Features: The attributes used to make

the ham / spam decision
 Words: FREE!
 Text Patterns: $dd, CAPS
 Non-text: SenderInContacts
 …

Example: Digit Recognition
 Input: x = images (pixel grids)
 Output: y = a digit 0-9
 Setup:
 Get a large collection of example images, each

labeled with a digit
 Note: someone has to hand label all this data!
 Want to learn to predict labels of new, future digit
images
 Features: The attributes used to make the digit

decision
 Pixels: (6,8)=ON
 Shape Patterns: NumComponents, AspectRatio,
NumLoops
 …

How to Learn
 Data: labeled instances, e.g. emails marked spam/ham
 Training set
 Held out (validation) set
 Test set
 Features: attribute-value pairs which characterize each x
 Experimentation cycle
 Learn parameters (e.g. model probabilities) on training set
 Tune hyperparameters on held-out set
 Compute accuracy on test set
 Very important: never “peek” at the test set!
 Evaluation
 Accuracy: fraction of instances predicted correctly
 Overfitting and generalization
 Want a classifier which does well on test data
 Overfitting: fitting the training data very closely, but not

generalizing well to test data

Document Classification
“planning
language
proof
intelligence”

Test
Data:
(AI)

(Programming)

(HCI)

Classes:
ML

Planning

Semantics

Garb.Coll.

Multimedia

Training learning
planning
programming garbage
...
Data:
intelligence
temporal semantics
collection
algorithm
reasoning language
memory
Reinforcement plan
proof...
optimization
network...
language...
region...

90

GUI
...

More Text Classification Examples
Many search engine functionalities use classification

Assigning labels to documents or web-pages:
 Labels are most often topics such as Yahoo-categories
 "finance," "sports," "news>world>asia>business"

 Labels may be genres (or, categories)
 "editorials" "movie-reviews" "news”
 Labels may be opinion on a person/product
 “like”, “hate”, “neutral”
 Labels may be domain-specific
 "interesting-to-me" : "not-interesting-to-me”
 language identification: English, French, Chinese, …
 search vertical: about Linux versus not
 “link spam” : “not link spam”

91

Classification Methods: History
 Manual classification
 Used by the original Yahoo! Directory
 Looksmart, about.com, ODP, PubMed
 Very accurate when job is done by experts
 Consistent when the problem size and team is small
 Difficult and expensive to scale
 Means we need automatic classification methods for big problems
92

Classification Methods: History
 Automatic classification
 Hand-coded rule-based systems
 One technique used by Reuters, CIA, etc.
 It’s what Google Alerts is doing
 Widely deployed in government and enterprise
 Companies provide “IDE” (integrated development environment) for writing
such rules
 E.g., assign category if document contains a given boolean combination of words
 Standing queries: Commercial systems have complex query languages (everything
in IR query languages +score accumulators)
 Accuracy is often very high if a rule has been carefully refined over time by a
subject expert
 Building and maintaining these rules is expensive
 Rules could vary with the change of domain
93

Classification Methods: History
 Supervised learning of a document-label assignment function
 Many systems partly rely on machine learning (Autonomy, Microsoft,

Enkata,Yahoo!, Google News, …)
 k-Nearest Neighbors (simple, powerful)
 Naive Bayes (simple, common method)
 Support-vector machines (new, more powerful)
 … plus many other methods
 Requirement: requires hand-classified training data
 But data can be built up (and refined) by amateurs

 Many commercial systems use a mixture of methods

94

NLP and ML: From Past to Present
 NLP based systems have enabled wide-range of applications
 Google’s powerful search engines, Google’s MT
 Alexa etc.
 Amazon Comprehend Medical services
 Cognitive Analytics and NLP, Spam detection, NLP in Recruitment
 Sentiment Analysis, Hate Speech detection, Fake News detection

 Shallow ML algorithms (corresponds to Statistical NLP)
 Used extensively (HMM, MaxEnt, CRF, SVM, Logistic Regression

etc.)
 Requires handcrafting of features
 Time-consuming
 Curse of dimensionality (because of joint modeling of language
models)

NLP and ML: From Past to Present
 Deep Learning algorithms
 No feature engineering
 Success of distributed representations (Neural language models)
 Some recent developments
 The rise of distributed representations (e.g., Word2vec, GLOVE,

ELMO, BERT etc)
 Convolutional, recurrent, recursive neural networks, Transformer,
Reinforcement learning
 Unsupervised sentence representation learning
 Combining deep learning models with memory-augmenting
strategies
 Explainable AI

Deep Learning (DL)
•Subfield of learning representations of data
•Exceptionally effective at learning patterns
•Deep learning algorithms attempt to learn (multiple levels of) representations
by using a hierarchy of multiple layers
•If you provide the system tons of information, it begins to understand it
and respond in useful ways

https://www.xenonstack.com/blog/static/public/uploads/media/machine-learning-vs-deep-learning.png

Why is DL useful?
o Manually designed features are often over-specified, incomplete and take a
long time to design and validate
o Learned Features are easy to adapt, fast to learn
o Deep learning provides a very flexible, (almost?) universal, learnable
framework for representing world, visual and linguistic information
o Can learn both unsupervised and supervised
o Effective end-to-end learning
o Utilize large amounts of training data

In ~2010 DL started
outperforming other ML
techniques
first in speech and vision, then NLP

News: March 27, 2019
Yoshua Bengio, Geoffrey Hinton, and Yann LeCun
received the
Turing Award-2018 (equivalent to Nobel Prize of
Computing)
 for Modern AI (specifically for deep learning research)

Bengio- University of Toronoto and Google
Hinton- University of Montreal
LeCun- Facebook’s chief AI scientist and a professor at NYU

Statistics are no panacea!

Books etc.
 Main Text(s):
 Natural Language Understanding: James Allan
 Speech and NLP: Jurafsky and Martin
 Foundations of Statistical NLP: Manning and Schutze
 Other References:
 NLP a Paninian Perspective: Bharati, Cahitanya and Sangal
 Statistical NLP: Charniak
 Journals
 Computational Linguistics, Natural Language Engineering, AI, AI
Magazine, IEEE SMC
 Conferences
 ACL, EACL, COLING, MT Summit, EMNLP, IJCNLP, HLT,
ICON, SIGIR, WWW, ICML, ECML
Alpha-Beta Pruning
    • Alpha-beta pruning is a modified version of the minimax algorithm. It is an optimization technique for the minimax algorithm.
    • As we have seen in the minimax search algorithm that the number of game states it has to examine are exponential in depth of the tree. Since we cannot eliminate the exponent, but we can cut it to half. Hence there is a technique by which without checking each node of the game tree we can compute the correct minimax decision, and this technique is called pruning. This involves two threshold parameter Alpha and beta for future expansion, so it is called alpha-beta pruning. It is also called as Alpha-Beta Algorithm.
    • Alpha-beta pruning can be applied at any depth of a tree, and sometimes it not only prune the tree leaves but also entire sub-tree.
    • The two-parameter can be defined as:
        a. Alpha: The best (highest-value) choice we have found so far at any point along the path of Maximizer. The initial value of alpha is -∞.
        b. Beta: The best (lowest-value) choice we have found so far at any point along the path of Minimizer. The initial value of beta is +∞.
    • The Alpha-beta pruning to a standard minimax algorithm returns the same move as the standard algorithm does, but it removes all the nodes which are not really affecting the final decision but making algorithm slow. Hence by pruning these nodes, it makes the algorithm fast.
Condition for Alpha-beta pruning:
The main condition which required for alpha-beta pruning is:
    1. α>=β  
Key points about alpha-beta pruning:
    • The Max player will only update the value of alpha.
    • The Min player will only update the value of beta.
    • While backtracking the tree, the node values will be passed to upper nodes instead of values of alpha and beta.
    • We will only pass the alpha, beta values to the child nodes.
    • Working of Alpha-Beta Pruning:
    • Let's take an example of two-player search tree to understand the working of Alpha-beta pruning
    • Step 1: At the first step the, Max player will start first move from node A where α= -∞ and β= +∞, these value of alpha and beta passed down to node B where again α= -∞ and β= +∞, and Node B passes the same value to its child D.
    • 
    • Step 2: At Node D, the value of α will be calculated as its turn for Max. The value of α is compared with firstly 2 and then 3, and the max (2, 3) = 3 will be the value of α at node D and node value will also 3.
    • Step 3: Now algorithm backtrack to node B, where the value of β will change as this is a turn of Min, Now β= +∞, will compare with the available subsequent nodes value, i.e. min (∞, 3) = 3, hence at node B now α= -∞, and β= 3.
    • 
    • In the next step, algorithm traverse the next successor of Node B which is node E, and the values of α= -∞, and β= 3 will also be passed.
    • Step 4: At node E, Max will take its turn, and the value of alpha will change. The current value of alpha will be compared with 5, so max (-∞, 5) = 5, hence at node E α= 5 and β= 3, where α>=β, so the right successor of E will be pruned, and algorithm will not traverse it, and the value at node E will be 5.
    • 
    • Step 5: At next step, algorithm again backtrack the tree, from node B to node A. At node A, the value of alpha will be changed the maximum available value is 3 as max (-∞, 3)= 3, and β= +∞, these two values now passes to right successor of A which is Node C.
    • At node C, α=3 and β= +∞, and the same values will be passed on to node F.
    • Step 6: At node F, again the value of α will be compared with left child which is 0, and max(3,0)= 3, and then compared with right child which is 1, and max(3,1)= 3 still α remains 3, but the node value of F will become 1.
    • 
    • Step 7: Node F returns the node value 1 to node C, at C α= 3 and β= +∞, here the value of beta will be changed, it will compare with 1 so min (∞, 1) = 1. Now at C, α=3 and β= 1, and again it satisfies the condition α>=β, so the next child of C which is G will be pruned, and the algorithm will not compute the entire sub-tree G.

 Step 8: C now returns the value of 1 to A here the best value for A is max (3, 1) = 3. Following is the final game tree which is the showing the nodes which are computed and nodes which has never computed. Hence the optimal value for the maximizer is 3 for this example.

Move Ordering in Alpha-Beta pruning:

The effectiveness of alpha-beta pruning is highly dependent on the order in which each node is examined. Move order is an important aspect of alpha-beta pruning.
It can be of two types:
    • Worst ordering: In some cases, alpha-beta pruning algorithm does not prune any of the leaves of the tree, and works exactly as minimax algorithm. In this case, it also consumes more time because of alpha-beta factors, such a move of pruning is called worst ordering. In this case, the best move occurs on the right side of the tree. The time complexity for such an order is O(bm).

Ideal ordering: The ideal ordering for alpha-beta pruning occurs when lots of pruning happens in the tree, and best moves occur at the left side of the tree. We apply DFS hence it first search left of the tree and go deep twice as minimax algorithm in the same amount of time. Complexity in ideal ordering is O(bm/2).
Rules to find good ordering:
Following are some rules to find good ordering in alpha-beta pruning:
    • Occur the best move from the shallowest node.
    • Order the nodes in the tree such that the best nodes are checked first.
    • Use domain knowledge while finding the best move. Ex: for Chess, try order: captures first, then threats, then forward moves, backward moves.
    • We can bookkeep the states, as there is a possibility that states may repeat.


For more example
https://www.scribd.com/document/617163104/Alpha-Beta-Pruning-Algorithm,MIN-MAX algorithm:
• The min max algorithm in AI, popularly known as the minimax, is a
backtracking algorithm.
• It is used in decision making, game theory and artificial intelligence
(AI).
• It is used to find the optimal move for a player, assuming that the
opponent is also playing optimally.
• Popular two-player computer or online games like Chess, Tic-Tac-Toe,
Checkers, Go, etc. use this algorithm.
A backtracking algorithm is used to find a solution to computational
problems in such a way that a candidate is incrementally built towards a
solution, one step at a time. And the candidate that fails to complete a
solution is immediately abandoned.

How does it work?
In the min max algorithm in AI, there are two players, Maximiser and
Minimiser. Both these players play the game as one tries to get the highest
score possible or the maximum benefit while the opponent tries to get the
lowest score or the minimum benefit.
Every game board has an evaluation score assigned to it, so the Maximiser
will select the maximised value, and the Minimiser will select the minimised
value with counter moves. If the Maximiser has the upper hand, then the
board score will be a positive value, and if the Minimiser has the upper
hand, then the board score will be a negative value.

Working of Min-Max Algorithm:
o

The working of the minimax algorithm can be easily described using an example.
Below we have taken an example of game-tree which is representing the two-player
game.

o

In this example, there are two players one is called Maximizer and other is called
Minimizer.

o

Maximizer will try to get the Maximum possible score, and Minimizer will try to get
the minimum possible score.

o

This algorithm applies DFS, so in this game-tree, we have to go all the way through
the leaves to reach the terminal nodes.

o

At the terminal node, the terminal values are given so we will compare those value
and backtrack the tree until the initial state occurs. Following are the main steps
involved in solving the two-player game tree:

Step-1: In the first step, the algorithm generates the entire game-tree and apply the
utility function to get the utility values for the terminal states. In the below tree
diagram, let's take A is the initial state of the tree. Suppose maximizer takes first turn
which has worst-case initial value =- infinity, and minimizer will take next turn which
has worst-case initial value = +infinity.

Step 2: Now, first we find the utilities value for the Maximizer, its initial value is -∞,
so we will compare each value in terminal state with initial value of Maximizer and
determines the higher nodes values. It will find the maximum among the all.
Backward Skip 10sPlay VideoForward Skip 10s
o

For node D

max(-1,- -∞) => max(-1,4)= 4

o

For Node E

max(2, -∞) => max(2, 6)= 6

o

For Node F

max(-3, -∞) => max(-3,-5) = -3

o

For node G

max(0, -∞) = max(0, 7) = 7

Step 3: In the next step, it's a turn for minimizer, so it will compare all nodes value
with +∞, and will find the 3rd layer node values.
o

For node B= min(4,6) = 4

o

For node C= min (-3, 7) = -3

Step 4: Now it's a turn for Maximizer, and it will again choose the maximum of all
nodes value and find the maximum value for the root node. In this game tree, there
are only 4 layers, hence we reach immediately to the root node, but in real games,
there will be more than 4 layers.
o

For node A max(4, -3)= 4

That was the complete workflow of the minimax two player game.

Properties of Mini-Max algorithm:
o

Complete- Min-Max algorithm is Complete. It will definitely find a solution (if exist),
in the finite search tree.

o

Optimal- Min-Max algorithm is optimal if both opponents are playing optimally.

o

Time complexity- As it performs DFS for the game-tree, so the time complexity of
Min-Max algorithm is O(bm), where b is branching factor of the game-tree, and m is
the maximum depth of the tree.

o

Space Complexity- Space complexity of Mini-max algorithm is also similar to DFS
which is O(bm).

Limitation of the minimax Algorithm:
The main drawback of the minimax algorithm is that it gets really slow for complex
games such as Chess, go, etc. This type of games has a huge branching factor, and
the player has lots of choices to decide. This limitation of the minimax algorithm can
be improved from alpha-beta pruning which we have discussed in the next topic.

Key points in Alpha-beta Pruning
•

Alpha:

Alpha is the best choice or the highest value that we

have found at any instance along the path of Maximizer. The
initial value for alpha is – ∞.
•

•

Beta: Beta is the best choice or the lowest value that we have
found at any instance along the path of Minimizer. The initial
value for alpha is + ∞.
The condition for Alpha-beta Pruning is that α >= β.

•

Each node has to keep track of its alpha and beta values. Alpha
can be updated only when it’s MAX’s turn and, similarly, beta can
be updated only when it’s MIN’s chance.

•
•

MAX will update only alpha values and MIN player will update only
beta values.
The node values will be passed to upper nodes instead of values

•

of alpha and beta during go into reverse of tree.
Alpha and Beta values only be passed to child nodes.

Working of Alpha-beta Pruning
1.

We will first start with the initial move. We will initially define the
alpha and beta values as the worst case i.e. α = -∞ and β= +∞. We
will prune the node only when alpha becomes greater than or
equal to beta.

2. Since the initial value of alpha is less than beta so we didn’t prune it. Now
it’s turn for MAX. So, at node D, value of alpha will be calculated. The value
of alpha at node D will be max (2, 3). So, value of alpha at node D will be 3.
3. Now the next move will be on node B and its turn for MIN now. So, at node
B, the value of alpha beta will be min (3, ∞). So, at node B values will be
alpha= – ∞ and beta will be 3.

In the next step, algorithms traverse the next successor of Node B which is
node E, and the values of α= -∞, and β= 3 will also be passed.
4. Now it’s turn for MAX. So, at node E we will look for MAX. The current value
of alpha at E is – ∞ and it will be compared with 5. So, MAX (- ∞, 5) will be 5.
So, at node E, alpha = 5, Beta = 5. Now as we can see that alpha is greater
than beta which is satisfying the pruning condition so we can prune the
right successor of node E and algorithm will not be traversed and the value
at node E will be 5.

6. In the next step the algorithm again comes to node A from node B. At
node A alpha will be changed to maximum value as MAX (- ∞, 3). So now
the value of alpha and beta at node A will be (3, + ∞) respectively and will
be transferred to node C. These same values will be transferred to node F.
7. At node F the value of alpha will be compared to the left branch which is
0. So, MAX (0, 3) will be 3 and then compared with the right child which is 1,
and MAX (3,1) = 3 still α remains 3, but the node value of F will become 1.

8. Now node F will return the node value 1 to C and will compare to beta
value at C. Now its turn for MIN. So, MIN (+ ∞, 1) will be 1. Now at node C, α= 3,
and β= 1 and alpha is greater than beta which again satisfies the pruning
condition. So, the next successor of node C i.e. G will be pruned and the
algorithm didn’t compute the entire subtree G.

Now, C will return the node value to A and the best value of A will be MAX (1,
3) will be 3.

The above represented tree is the final tree which is showing the nodes
which are computed and the nodes which are not computed. So, for this
example the optimal value of the maximizer will be 3.
